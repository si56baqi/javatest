package com.example.springdocker.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println("这是控制台日志！");
        return   "HELLO-BUG！！！！！！！！！！";
    }
}
