package com.si56baqi.ioc.impl;

import com.si56baqi.ioc.PersonDao;
import com.si56baqi.ioc.PersonService;

public class PersonServiceImpl implements PersonService {
    //定义接口
    private PersonDao personDao;
    //提供set()方法，用于依赖注入
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void addPerson() {
        personDao.add(); // 调用PersonDao中的add()方法
        System.out.println("addPerson()执行了...");
    }
}
