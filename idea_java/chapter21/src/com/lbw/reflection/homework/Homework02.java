package com.lbw.reflection.homework;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//利用Class类的forName方法得到File类的class对象
//2.在控制台打印File类的所有构造器
//3.通过newlnstance的方法创建File对象，并创建E：\mynew.txt文件
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        System.out.println(new File("").getClass());
        Class<?> cls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        Object o = cls.getConstructor(String.class).newInstance("d:\\mynew.txt");
        Method createNewFile = cls.getDeclaredMethod("createNewFile");
        createNewFile.invoke(o);

    }

}
