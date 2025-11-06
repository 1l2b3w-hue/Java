package com.lbw.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射访问和操作属性
 */
public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> stuClass = Class.forName("com.lbw.reflection.Student");
        Object o = stuClass.getDeclaredConstructor().newInstance();

        // 反射获取和操作 age 属性
        Field age = stuClass.getField("age"); // 获取 age 对应的Field 对象
        age.set(o,20);// 设置属性
        System.out.println(o);
        System.out.println(age.get(o)); // 获取属性

        // 获取和操作 name 属性
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o,"韩顺平");
        name.set(null,"老韩");
        System.out.println(o);


    }

}
class Student {
    public int age;
    private static String name;
    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +",name='" + name  +
                '}';
    }
}
