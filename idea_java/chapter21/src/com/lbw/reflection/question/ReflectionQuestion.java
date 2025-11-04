package com.lbw.reflection.question;

import com.lbw.reflection.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {

    public static void main(String[] args) {
        // 根据配置文件 re.properties 指定消息，创建 Cat 对象并调用方法

        // 传统
        Cat cat = new Cat();
        cat.hi();

        //
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\re.properties"));
            properties.list(System.out);
            String classFullpath = properties.getProperty("classfullpath");
            String method = properties.getProperty("method");
            System.out.println(classFullpath + "." + method);

            // 传统方式无法解决
            // new classFullpath(); 最傻逼的创建方式，因此无法实现读取配置文件来创建一个对象


            // 使用反射机制解决
            System.out.println("-- 反射机制解决 --");
            //1. 加载类，返回 Class 类型的对象
            Class cls = Class.forName(classFullpath); // 这里 Class 就是一个类
            // 2. 通过 cls 得到加载类的对象实例
            Object obj = cls.getDeclaredConstructor().newInstance();
            System.out.println(obj.getClass());
            // 3. 通过 cls 得到你加载类com.lbw.Cat 的 方法对象
            //      在反射中，可以把方法看成一个对象(万物皆对象)
            Method method1 = cls.getMethod(method);
            // 4.  通过 method1 来调用方法 ：即通过方法对象来调用方法
            method1.invoke(obj);  // 传统就是 对象.方法名()  反射：方法.invoke(对象)
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
