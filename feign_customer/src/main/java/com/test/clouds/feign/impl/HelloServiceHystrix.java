package com.test.clouds.feign.impl;

import com.test.clouds.feign.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello() {
        return "access service1 is error";
    }
}
