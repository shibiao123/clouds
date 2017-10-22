package com.test.clouds.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service1")
public interface HelloService {
    @RequestMapping("/hello")
    public String hello();
}
