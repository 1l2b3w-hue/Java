package com.generic.improve;

import java.util.ArrayList;

public class GenericImprove {
    public static void main(String[] args) {
//        泛型
//        ArrayList<Dog> : 表示存放到 arrayList 集合中的元素是 Dog 类型
//        编译器会进行检测，如果添加的元素不满足要求，就会报错，一个数据约束
//        可以直接从集合中取出 Dog 类型，不需要进行转换
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("小花",10));
        arrayList.add(new Dog("大白",8));
        arrayList.add(new Dog("赛虎",4));

//        如果添加了一个猫对象，会导致报错 (无法约束添加数据)
//        arrayList.add(new Cat("招财猫",8));
        for (Dog dog : arrayList) {
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