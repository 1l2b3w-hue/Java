package com.lbw.reflection;

import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    //第一组方法API
    @Test
    public void api_01() throws Exception {
        Class<?> cls = Class.forName("com.lbw.reflection.Person");
        // getName : 获取全类名
        System.out.println(cls.getName()); // com.lbw.reflection.Person
        // getSimpleName : 获取简单类名
        System.out.println(cls.getSimpleName()); // Person
        // getFields : 获取所有public所修饰的属性，包括本类和父类
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        // getDeclaredFields : 获取本类中所有的属性
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }
        // getMethods : 获取所有 public 修饰的方法，包括本类和父类
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        // getDeclaredMethods : 获取本类中所有的方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        // getConstructors : 获取本类所有 public 修饰的构造器，
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器" + constructor.getName());
        }
        // getDeclaredConstructors : 获取本类所有的构造器
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor.getName());
        }
        // getPackage : 以 Package 形式返回 包信息
        Package aPackage = cls.getPackage();
        System.out.println(aPackage.getName());
        // getSuperclass : 以 Class 形式返回父类信息(父类的 class 对象)
        Class<?> superclass = cls.getSuperclass();
        System.out.println(superclass.getName());
        // getInterfaces : 以class[] 形式返回接口信息
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        // getAnnotation : 以 Annotation[] 形式返回注解信息
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
        }

    }

    // 第二组 API 方法
    @Test
    public void api_02() throws Exception {
        Class<?> cls = Class.forName("com.lbw.reflection.Person");
        // getModifiers : 以 int 类型返回修饰符
        // getType : 返回该属性对应的那个类(数据类型)的class 对象
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("本类中的所有属性 ：" + field.getName() +
                " 该属性的修饰符值 ："  + field.getModifiers() +
                " 该属性对应的class ：" + field.getType().getName());
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.print("本类中的所有方法" + method.getName() +
                    " 该方法的修饰符值 ："  + method.getModifiers() +
                    " 该方法的返回值 ：" + method.getReturnType()+
                    " 该方法的参数列表 ："  );
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.print(parameterType + " ");
            }
            System.out.println();
        }

        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("该类的构造器：" + constructor.getName() +
                    " 该类的修饰符值：" + constructor.getModifiers());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的参数列表为：" + parameterType );
            }
        }
    }
}
class A {
    public String hobby;
    public void a1() {}
    public A() {}
    public A(String hobby) {}
}
interface B {}
@Deprecated
class Person extends A implements Serializable,B {
    public String name;
    protected static int age;
    String job;
    private double sal;

    public Person() {
    }
    public Person(String name, int age, String job, double sal) {}
    private Person(String name, int age, String job) {}

    public void m1(String name,int age ,double sal) {}
    protected String m2() { return null; }
    void m3(){}
    private void m4() {}
}
