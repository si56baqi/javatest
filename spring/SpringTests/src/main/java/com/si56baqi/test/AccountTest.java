package com.si56baqi.test;

import com.si56baqi.instance.mengma.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    @Test
    public void test() {
        // 获得Spring容器，并操作

        /*Spring声明式事务管理（基于XML方式实现）*/
        String xmlPath = "c3p0-db.xml";
        /*Spring声明式事务管理（基于Annotation注解方式实现）的xmlPath1*/
        String xmlPath1="annotation.xml";
        //加载xml配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath1);
        //获取bean
        AccountService accountService = (AccountService) applicationContext
                .getBean("accountService");
        accountService.transfer("zhangsan", "lisi", 100);
    }
}
