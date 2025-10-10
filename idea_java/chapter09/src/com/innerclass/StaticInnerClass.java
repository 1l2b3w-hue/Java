package com.innerclass;

import org.w3c.dom.ls.LSOutput;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.m1();
//        外部其他类访问静态内部类
//        直接通过类名来进行访问
        Outer06.Inner06 inner06 = new Outer06.Inner06();
        inner06.say();
//        通过在外部类实现返回静态内部类的方法来进行获取静态内部类
//        非静态方法
        System.out.println("===========");
        outer06.getInner06().say();
//        静态方法
        System.out.println("============");
        Outer06.getInner06_().say();

    }
}
class Outer06 {
    private static String name = "Jack";
    private int n1 = 10;
//    定义在外部类的成员位置，使用static修饰
//    能直接访问到外部类的静态成员，不能访问到非静态成员
//    可以添加访问修饰符
//    作用域 ： 整个外部类体
    public static void m2() {
        System.out.println("静态方法");
    }
    static class Inner06 {
        public String name = "韩顺平";
        public void say() {
//            System.out.println(n1);
            System.out.println(name);
            System.out.println(Outer06.name);
            m2();
        }

    }
    public void m1 () {
        new Inner06().say();
    }
    public Inner06 getInner06() {
        return new Inner06();
    }
    public static Inner06 getInner06_() {
        return new Inner06();
    }
}
