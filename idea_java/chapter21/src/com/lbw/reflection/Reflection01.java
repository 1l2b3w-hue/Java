package com.lbw.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src\\re.properties"));
        properties.list(System.out);
        String classFullpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");
        System.out.println(classFullpath + "." + method);

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

        // java.lang.reflect.Field :
        // 获取某个类的成员变量
        // getField 无法获取一个私有的成员变量
        Field age = cls.getField("age");
        System.out.println(age.get(obj));//对象.成员变量名() 成员变量对象.get(对象)

        // java.lang.reflect.constructor : 获取某个类的构造方法
        //getConstructor() : () 内容可以指定构造器的参数类型，指定特定的构造器
        Constructor constructor = cls.getConstructor(); // 获取无参构造器
        System.out.println(constructor);
            // 传入的 String.class 指 String 类的 Class 对象
        Constructor constructor1 = cls.getConstructor(String.class, int.class);
        System.out.println(constructor1);
    }
}
