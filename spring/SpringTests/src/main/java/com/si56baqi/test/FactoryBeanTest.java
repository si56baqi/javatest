package com.si56baqi.test;

import com.si56baqi.instance.mengma.dao.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("factorybean.xml");
        CustomerDao customerDao= (CustomerDao) applicationContext.getBean("customerDaoProxy");
        customerDao.add();
        customerDao.delete();
        customerDao.find();
        customerDao.update();
    }
    /*Spring通知类型及使用ProxyFactoryBean创建AOP代理*/
}
