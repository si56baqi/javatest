package com.si56baqi.instance.mengma.jdk;

import com.si56baqi.instance.mengma.dao.CustomerDao;
import com.si56baqi.instance.mengma.dao.impl.CustomerDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 创建代理类 MyBeanFactory
    在该类中使用 java.lang.reflect.Proxy 实现 JDK 动态代理，
* */
public class MyBeanFactory {
    public static CustomerDao getBean() {
        // 准备目标类
        final CustomerDao customerDao = new CustomerDaoImpl();
        // 创建切面类实例
        final MyAspect myAspect = new MyAspect();
        // 使用代理类，进行增强
        return (CustomerDao) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                new Class[] { CustomerDao.class }, new InvocationHandler() {
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        myAspect.myBefore(); // 前增强
                        Object obj = method.invoke(customerDao, args);
                        myAspect.myAfter(); // 后增强
                        return obj;
                    }
                });
    }
}
