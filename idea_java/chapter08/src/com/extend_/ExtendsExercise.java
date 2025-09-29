package com.extend_;


public class ExtendsExercise {
    public static void main(String[] args) {
//        B b = new B();
        C c = new C();
    }
}
class A {
    public A() {
        System.out.println("我是A类");
    }
}
class B extends A {
    public B() {
        System.out.println("我是B类无参构造函数");
    }
    public B(String name) {
        System.out.println(name + "我是B类有参构造函数");
    }
}
class C extends B {
    public C() {
        this("Hello");
        System.out.println("我是C类无参构造函数");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是C类有参构造函数");
    }
}


//class A {
//    A() {
//        System.out.println("a");
//    }
//    A(String name) {
//        System.out.println("a name");
//    }
//}
//class B extends A {
//    B() {
//        this("abc");
//        System.out.println("b");
//    }
//    B(String name) {
//        System.out.println("b name");
//    }
//}