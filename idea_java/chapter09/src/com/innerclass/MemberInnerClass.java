package com.innerclass;

import org.w3c.dom.ls.LSOutput;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.test();
//        外部其他类访问成员内部类(3种方式)
//         outer05.new Inner05() ; 相当于把 new Inner05 当作outer05的成员
        Outer05.Inner05 inner05 = outer05.new Inner05();
        inner05.printInfo();
//        在外部类编写一个方法，返回一个内部类类型
        Outer05.Inner05 inner05_1 = outer05.getInner05();
        inner05_1.printInfo();
//        3.先new外部类，又new内部类，跟第一种形式一致
        new Outer05().new Inner05().printInfo();
    }
}
class Outer05 {
    private String name = "Jack";
    private int age = 18;
    private void t2() {
        System.out.println("私有");
    }
//    可以增加任何访问修饰符，因为其本质就是一个成员
//    作用域就是整个外部类
    class Inner05 {
        private int n2 = 99;
//        可以直接访问外部类的所有成员，包括私有
        public void printInfo() {
//      内部类访问外部类 ： 直接访问
            System.out.println("name = " + name + ", age = " + age);
            t2();
        }
    }
    public Inner05 getInner05() {
        return new Inner05();
    }
    public void test() {
//        外部类访问内部类 ： 创建内部类实例对象，再访问
        Inner05 inner05 = new Inner05();
        inner05.printInfo();
        System.out.println(inner05.n2);
    }
}
