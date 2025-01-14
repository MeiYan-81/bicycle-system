package com.ps.bicycleuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BicycleUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BicycleUserServiceApplication.class, args);
    }

}
