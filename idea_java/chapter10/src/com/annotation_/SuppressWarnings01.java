package com.annotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        程序可以运行，但是编译器会使用下划线提示一个警告
//        如果不想显示这些警告，可以通过@SuppressWarnings来抑制这些警告
//        在{""}中，可以加入你想要抑制的警告信息,all 是抑制所有的警告信息
//        SuppressWarnings作用范围与放置位置有关(语句、方法、类)
//            修饰类、字段、方法、参数、构造器...
//            传递一个字符串数组，表明可以接受多个抑制信息
//        @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
//        @Retention(RetentionPolicy.SOURCE)
//        public @interface SuppressWarnings {
//        String[] value();
//    }

        List list = new ArrayList();
        list.add("Jack");
        list.add("Tom");
        list.add("smith");
        System.out.println(list.get(1));
    }
}
