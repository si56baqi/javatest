package com.si56baqi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.si56baqi.client.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloFeign helloFeign;

    @GetMapping("/hello/{name}")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(@PathVariable String name){
        return helloFeign.hello(name);
    }

    //对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
    public String helloFallback(String name){
        return "tony";	//失败调用时，返回默认值
    }
}
