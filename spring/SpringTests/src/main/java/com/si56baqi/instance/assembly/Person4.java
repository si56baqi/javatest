package com.si56baqi.instance.assembly;

public class Person4 {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person4(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Person4() {
        super();
    }
}
