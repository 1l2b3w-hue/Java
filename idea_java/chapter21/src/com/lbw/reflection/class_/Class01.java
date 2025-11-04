package com.lbw.reflection.class_;

import com.lbw.reflection.Cat;

/**
 * 对 Class 类进行一个梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class 也是一个类，也继承于 Object
//        Class
        //2. Class 类对象不是通过 new 创建出来的，而是通过系统创建出来
        Cat cat = new Cat();

        //3. 某个类的 Class 对象，在内存中只会存在一个，因为类的加载只会执行一次
        Class cls1 = Class.forName("com.lbw.reflection.Cat");
        Class cls2 = Class.forName("com.lbw.reflection.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());

        //

    }
}
