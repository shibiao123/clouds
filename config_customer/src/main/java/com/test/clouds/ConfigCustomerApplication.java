package com.test.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigCustomerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigCustomerApplication.class,args);
    }
}
