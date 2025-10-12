package com.string_;

public class StringExercise01 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
//        1.先创建一个 StringBuilder sb = StringBuilder();
//        2.执行 sb.append("hello");
//        3.再执行 sb.append("abc");
//        4. String c = sb.toString();
//        最后就是c指向了堆中的一个对象(String),该对象的value并不会指向常量池中的"helloabc"(并且常量池中
//        也没有"helloabc"这个字符串)，而是指向自身存放字符序列的数组
        String c = a + b;
//        当调用intern()方法后，直接把当前堆中这个 String 对象引用放入常量池。
//        常量池的引用也将会指向堆中的String对象(新增字符串 ： "helloabc")
        System.out.println(c == c.intern()); // true
//        String d = "helloabc";
//        System.out.println(c == d);
    }
}
