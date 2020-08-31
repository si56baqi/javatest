package com.si56baqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients            //开启Feign
public class FeignRunApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignRunApp.class, args);
    }

}
