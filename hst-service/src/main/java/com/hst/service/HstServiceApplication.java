package com.hst.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HstServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HstServiceApplication.class, args);
    }

}
