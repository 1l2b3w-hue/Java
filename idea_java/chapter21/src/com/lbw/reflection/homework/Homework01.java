package com.lbw.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//.定义PrivateTest类，有私有name属性，并且属性值为hellokitty
//2.提供getName的公有方法
//3.创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值，
//并调用getNameO的方法打印name属性值
public class Homework01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        PrivateTest privateTest = new PrivateTest();
//        Class<? extends PrivateTest> cls = privateTest.getClass();
        Class<?> cls = Class.forName("com.lbw.reflection.homework.PrivateTest");
        Object o = cls.getConstructor().newInstance();

        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"韩顺平教育");

        Method getName = cls.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}
class PrivateTest {
    private String name = "helloKitty";

    public PrivateTest() {
    }

    public String getName() {
        return name;
    }
}