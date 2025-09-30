package com.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); // 40 -> 30
        System.out.println(a.sum1()); // 30 -> 20
    }
}
class A{
    public int i = 10;
//    动态绑定机制 ：
//        当调用对象方法时，该方法将会与该对象的运行类型/内存地址绑定
//        当访问对象属性时，没有动态绑定机制，哪里声明哪里调用
    public int sum() {
        return getI() + 10;
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}
class B extends A {
    public int i = 20;
//    public int sum() {
//        return getI() + 20;
//    }
//    public int sum1() {
//        return i + 10;
//    }
    public int getI() {
        return i;
    }
}