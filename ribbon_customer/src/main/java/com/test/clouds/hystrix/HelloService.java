package com.test.clouds.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 客户端负载均衡都是放消费者里面配置
 * 熔断器的操作也是在消费者本身的代码里去实现的
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://service1/hello",String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}
