package com.si56baqi.instance.static_factory;

public class MyBeanFactory {
    // 创建Bean实例的静态工厂方法
    public static Person2 createBean(){
        return new Person2();
    }
}
