package com.si56baqi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.si56baqi.sso.mapper")
public class RunAppJtSsoProvider {
    public static void main(String[] args) {
        SpringApplication.run(RunAppJtSsoProvider.class, args);
    }
}
