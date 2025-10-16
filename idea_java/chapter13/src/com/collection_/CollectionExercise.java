package com.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
         List list = new ArrayList();
         list.add(new Dog("小白",9));
         list.add(new Dog("小花",10));
         list.add(new Dog("赛虎",4));

        System.out.println("=======迭代器========");
         Iterator iterator =list.iterator();
         while(iterator.hasNext()) {
             Object obj = iterator.next();
             System.out.println(obj);
         }
        System.out.println("=======增强for循环========");
         for(Object obj : list) {
             System.out.println(obj);
         }
    }
}
class Dog {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
                '}';
    }
}
