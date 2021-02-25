package com.si56baqi.test;

import com.si56baqi.instance.mengma.dao.CustomerDao;
import com.si56baqi.instance.mengma.jdk.MyBeanFactory;
import org.junit.jupiter.api.Test;

public class JDKProxyTest {
    @Test
    public void test() {
        // 从工厂获得指定的内容（相当于spring获得，但此内容时代理对象）
        CustomerDao customerDao = MyBeanFactory.getBean();
        // 执行方法
        customerDao.add();
        customerDao.update();
        customerDao.delete();
        customerDao.find();
    }
    /*
    * jdk动态代理
    * */
}
