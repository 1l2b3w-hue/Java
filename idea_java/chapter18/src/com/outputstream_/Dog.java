package com.outputstream_;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;
//    序列化并不会对使用 static 和 transient 修饰的成员进行序列化
    private static String nation;
    private transient String color;
    private Master master = new Master();
    public Dog(String name, int age, String color, String nation) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
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


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                nation + '}';
    }
}