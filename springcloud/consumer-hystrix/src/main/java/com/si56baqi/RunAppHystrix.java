package com.si56baqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication        //内置开启hystrix
@EnableFeignClients            //开启feign
public class RunAppHystrix {
    public static void main(String[] args) {
        SpringApplication.run(RunAppHystrix.class, args);
    }
}
