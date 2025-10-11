package com.homework;

public class Homework02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}

