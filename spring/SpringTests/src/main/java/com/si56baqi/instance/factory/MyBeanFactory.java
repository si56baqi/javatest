package com.si56baqi.instance.factory;


public class MyBeanFactory {
    public MyBeanFactory(){
        System.out.println("person3工厂实例化中");
    }
    // 创建Bean的方法
    public Person3 createBean() {
        return new Person3();
    }

}
