package com.buba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YgsxServerGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(YgsxServerGoodsApplication.class,args);
    }
}
