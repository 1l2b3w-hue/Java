package com.main_;

import com.sun.tools.javac.Main;

public class Main01 {
//    静态成员
    public static String name = "荆门东宝";
    public static void hi() {
        System.out.println("厚道荆门！");
    }
//    非静态成员
    public String name1 = "荆门掇刀";
    public void ha() {
        System.out.println("更厉害！");
    }
    public static void main(String[] args) {
//        可以直接访问本类的静态成员
        System.out.println(name);
        hi();
//        不能直接访问本类非静态成员！需要创建对象实例来访问

        System.out.println(new Main01().name1);
        new Main01().ha();
    }
}
