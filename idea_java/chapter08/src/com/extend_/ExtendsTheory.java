package com.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.getAge());
//        System.out.println(son.age); 即使爷爷类有，也不能访问到，因为找到爸爸类时，发现以及私有了
//        不会再继续往下找，直接报错，停止查找
        System.out.println(son.hobby);
//      按照一定的查找关系来返回信息 ：
//        1.先查看子类是否有该属性，有并且可以访问，则返回信息
//        2.如果子类没有，查看父类中是否含有该属性，有并且可以访问时，返回信息
//        3.如果父类还没有，继续往上找，直到Object还未找到，直接报错
    }
}
class Grandpa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 59;
}
class Father extends Grandpa {
    String name = "小头爸爸";
    private int age = 39;
    public int getAge() {
        return age;
    }
}
class Son extends Father {
    String name = "大头儿子";
}
