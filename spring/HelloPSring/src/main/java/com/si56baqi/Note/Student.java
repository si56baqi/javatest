package com.si56baqi.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;
/*
* @Required 注释应用于 bean 属性的 setter 方法，它表明受影响的
* bean 属性在配置时必须放在 XML 配置文件中，
* 否则容器就会抛出一个 BeanInitializationException 异常。
* */
    public Integer getAge() {
        return age;
    }
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }
}
