package com.si56baqi.test;

import com.si56baqi.ioc.PersonDao;
import com.si56baqi.ioc.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {

    @Test
    public void test01(){
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过spring容器获取personDao实例
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        //调用personDao的add()方法
        personDao.add();
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        personService.addPerson();
    }
    @Test
    public void test03() {
        // 定义Spring配置文件的路径

        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取id为person1的实例
        System.out.println(applicationContext.getBean("person1"));
    }
}
