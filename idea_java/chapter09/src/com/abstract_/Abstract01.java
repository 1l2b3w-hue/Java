package com.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
    }
}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    这里eat方法没有意义，即父类方法不确定性问题
//    就可以考虑将eat方法设计为抽象方法，
//    抽象方法，就是没有方法体的一个方法，使用abstract 来修饰
//    当在一个非抽象类中声明了一个抽象方法，此时必须使用abstract 来修饰该类，使其成为抽象类
//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么...");
//    }
    public abstract void eat();
}
abstract class A {
//    public abstract int age;
    public void hi() {
        System.out.println("hi");
    }
}
