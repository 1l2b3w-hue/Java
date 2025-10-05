package com.homework;

public class homework14 {
    public static void main(String[] args) {
        C1 c1 = new C1();
//        我是A类
//        hello我是B类的有参构造
//        haha我是c类的有参构造
//        我是C类的无参构造
    }
}
class A1 {
    public A1() {
        System.out.println("我是A类");
    }
}
class B1 extends A1 {
    public B1() {
        System.out.println("我是B类的无参构造");
    }
    public B1(String name) {
        System.out.println(name + "我是B类的有参构造");
    }
}
class C1 extends B1 {
    public C1() {
        super("hello");
        System.out.println("我是c类的无参构造");
    }
    public C1(String name) {
        super("haha");
        System.out.println(name + "我是c类的有参构造");
    }
}
