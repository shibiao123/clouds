package com.test.clouds.feign;

import com.test.clouds.feign.impl.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 客户端负载均衡都是放消费者里面配置
 * 熔断器的操作也是在消费者本身的代码里去实现的
 */
@FeignClient(value="service1",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping("/hello")
    public String hello();
}
