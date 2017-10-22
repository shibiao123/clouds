package com.test.clouds.controller;

import com.test.clouds.hystrix.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    HelloService helloService;

    @RequestMapping("customer")
    public String test(){
      return helloService.helloService();
    }
}
