package com.homework;

public class Homework07 extends Test {
    String name = "jack";
    Homework07() {
        super();
        System.out.println("Demo");
    }
    Homework07(String name) {
        super(name);
    }
    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Homework07().test(); // Test Demo Rose Jack
        new Homework07("John").test(); // John jack

    }
}
class Test {
    String name = "Rose";
    Test() {
        System.out.println("Test");
    }
    Test(String name) {
        this.name = name;
    }
}
