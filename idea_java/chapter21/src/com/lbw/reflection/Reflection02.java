package com.lbw.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection02 {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }
    public static void m1() {
        // 传统方式
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用耗时：" + (end - start));
    }

    public static void m2() {
        // 反射机制
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\re.properties"));
            Class<?> cls = Class.forName(properties.getProperty("classfullpath"));
            Object o = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getMethod("hi");
            long start = System.currentTimeMillis();
            for (int i = 0; i < 900000; i++) {
                method.invoke(o);
            }
            long end = System.currentTimeMillis();
            System.out.println("反射机制方法调用耗时为：" + (end - start));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void m3() {
        // 反射机制 + 优化
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\re.properties"));
            Class<?> cls = Class.forName(properties.getProperty("classfullpath"));
            Object o = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getMethod("hi");
            method.setAccessible(true);
            long start = System.currentTimeMillis();
            for (int i = 0; i < 900000; i++) {
                method.invoke(o);
            }
            long end = System.currentTimeMillis();
            System.out.println("反射机制方法调用耗时为：" + (end - start));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
