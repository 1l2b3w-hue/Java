package com.lbw.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> bossClass = Class.forName("com.lbw.reflection.Boss");

        Object o = bossClass.getDeclaredConstructor().newInstance();

        Method hi = bossClass.getMethod("hi",String.class);
        hi.invoke(o,"hsp");

        Method say = bossClass.getDeclaredMethod("say",int.class,String.class,char.class);
        say.setAccessible(true);
        String s1 =(String)say.invoke(o, 10, "hsp", 'c');
        String s2 =(String) say.invoke(null,10,"hsp",'c');
        System.out.println(s1);
        System.out.println(s2);



    }
}
class Boss {
    public int age;
    private static String name;
    public Boss() {}
    private static String say(int n, String s,char c) {
        return n + " " + s + " " + c;
    }
    public void hi(String s) {
        System.out.println("hi " + s);
    }
}
