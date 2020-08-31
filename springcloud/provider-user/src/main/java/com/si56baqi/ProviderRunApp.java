package com.si56baqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderRunApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRunApp.class, args);
    }
}
