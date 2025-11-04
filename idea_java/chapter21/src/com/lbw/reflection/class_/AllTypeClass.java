package com.lbw.reflection.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;// 外部类
        Class<Serializable> cls2 = Serializable.class;// 接口
        Class<Integer[]> cls3 = Integer[].class;// 数组
        Class<Integer[][]> cls4 = Integer[][].class; // 二维数组
        Class<Deprecated> cls5 = Deprecated.class; // 注解
        Class<Void> cls6 = void.class; // void
        Class<Thread.State> cls7 = Thread.State.class; // 枚举
        Class<Class> cls8 = Class.class;

        System.out.println("cls1: " + cls1);
        System.out.println("cls2: " + cls2);
        System.out.println("cls3: " + cls3);
        System.out.println("cls4: " + cls4);
        System.out.println("cls5: " + cls5);
        System.out.println("cls6: " + cls6);
        System.out.println("cls7: " + cls7);
        System.out.println("cls8: " + cls8);
    }
}
