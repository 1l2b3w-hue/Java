package com.list_;

import java.util.ArrayList;

public class ArrayListDetail {
    public static void main(String[] args) {
//        ArrayList 可以加入多个 null
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("Jack");
        System.out.println(arrayList);

//        由数组来实现数据存储
//        基本等同于Vector，除 ArrayList 是线程不安全(没有synchronized修饰方法)(执行效率高)；
//        多线程下不建议使用 ArrayList
    }
}
