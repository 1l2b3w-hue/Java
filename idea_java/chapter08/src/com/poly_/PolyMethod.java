package com.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        A a = new A();
//        方法重载,体现了方法sum的多种形态
        System.out.println(a.sum(12,34));
        System.out.println(a.sum(12,34,44));
        B b = new B();
//        方法的重写，体现了方法say的多种形态
        a.say();
        b.say();

    }
}
class B {
    public void say() {
        System.out.println("B类的say()方法");
    }
}
class A extends B{
    public int sum(int n1,int n2) {
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3) {
        return n1 + n2 + n3;
    }
    public void say() {
        System.out.println("A类的say()方法");
    }
}
