package com.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
//        传统
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小花",10));
        arrayList.add(new Dog("大白",8));
        arrayList.add(new Dog("赛虎",4));

//        如果添加了一个猫对象，会导致报错 (无法约束添加数据)
        arrayList.add(new Cat("招财猫",8));
        for (Object object : arrayList) {
            Dog dog = (Dog) object;
            System.out.println(dog.getName() + " " + dog.getAge());
        }
    }
}
class Dog {
    public String name;
    public int age;

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Cat {
    public String name;
    public int age;

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

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}