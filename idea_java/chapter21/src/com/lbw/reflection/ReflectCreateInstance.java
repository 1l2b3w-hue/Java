package com.lbw.reflection;

import java.lang.reflect.Constructor;

public class ReflectCreateInstance {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.lbw.reflection.C");

        //public无参构造器
        C c1 = (C)cls.newInstance();
        c1.say();
        Constructor<?> constructor = cls.getConstructor();
        C o = (C)constructor.newInstance();
        o.say();
        //public有参构造器
        Constructor<?> constructor1 = cls.getConstructor(String.class);
        C c2 = (C)constructor1.newInstance("smith");
        c2.say();
        //非public有参构造器
        // 获取私有构造器
        Constructor<?> ds = cls.getDeclaredConstructor(String.class, int.class);
        ds.setAccessible(true); // 进行爆破
        C c3 = (C)ds.newInstance("mary", 20);
        c3.say();
    }
}
class C {
    public String name = "Jack";
    public int age = 18;
    public C() {}
    public C(String name) {
        this.name = name;
    }
    private C(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {
        System.out.println(name + " " + age);
    }
}