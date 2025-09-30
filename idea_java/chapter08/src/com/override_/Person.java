package com.override_;
//编写一个Person类，包括属性/private（name、age），构造器、方法say（返
//        回自我介绍的字符串
public class Person {
    private String name;
    private int age;
    public Person(String name,int age) {
        setName(name);
        setAge(age);
    }
    public String say() {
        return "我是" + name + " 今年 " + age + " 岁";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
