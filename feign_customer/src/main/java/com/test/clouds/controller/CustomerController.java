package com.test.clouds.controller;

import com.test.clouds.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/customer")
    public String hello(){
       return helloService.hello();
    }

    @RequestMapping("/customer1")
    public String hello1(){
        return "feign_customer is happen";
    }
}
