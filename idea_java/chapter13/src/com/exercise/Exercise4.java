package com.exercise;

import java.util.TreeSet;

public class Exercise4 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
//        treeSet.add(new Person());
//        抛出一个异常，因为没有传入一个 Comparator 接口的匿名内部类
//        底层源码在进行转换时，会尝试着将 new Person() 对象转换为 Comparable 这个类型去调用
//        该类的compareTo 这个方法去比较，但问题来了，没有实现这个接口，无法转换成该类型，就会报错
    }
}
//class Person {}
