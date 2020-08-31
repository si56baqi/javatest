package com.si56baqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RunAppZuul {
    public static void main(String[] args) {
        SpringApplication.run(RunAppZuul.class, args);
    }
}
