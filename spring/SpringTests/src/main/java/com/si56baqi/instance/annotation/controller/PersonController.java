package com.si56baqi.instance.annotation.controller;

import com.si56baqi.instance.annotation.service.PersonService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller("personController")
public class PersonController {
    @Resource(name = "personService")
    private   PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }
    public void add() {
        personService.add(); // 调用personService中的add()方法
        System.out.println("Controller层的add()方法执行了...");
    }
}
