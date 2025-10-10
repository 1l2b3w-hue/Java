package com.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.m1();
    }
}
class Outer04 {
    private int n = 1;
    public void m1() {
        Person p = new Person() {
            public int n = 2;
            public void hi(String name) {
                System.out.println("匿名内部类重写hi()方法" + name);
                System.out.println(n); // 内部类访问外部类成员
                System.out.println(Outer04.this.n);
            }
        };

        p.hi("Jack"); // 引用调用
//        new Person() {
//            public void hi(String name) {
//                System.out.println("匿名内部类重写hi()方法哈哈" + name);
//            }
//        }.hi("smith"); // 看成对象直接调用

    }
}
class Person {
    public void hi(String name) {
        System.out.println("Person 的 hi方法" + name);
    }
}
