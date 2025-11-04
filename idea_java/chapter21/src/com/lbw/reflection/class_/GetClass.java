package com.lbw.reflection.class_;

import com.lbw.reflection.Car;

/**
 * 演示获取 Class 对象的方式
 */
public class GetClass {
    public static void main(String[] args) throws Exception {

        //1. Class 类的静态方法 forName() 获取 (编译阶段)
        String fullPath = "com.lbw.reflection.Car"; // 常通过读取配置文件获取
        Class<?> cls1 = Class.forName(fullPath);
        System.out.println(cls1);

        //2. 类名.class 多用于参数传递
        Class<Car> cls2 = Car.class;
        System.out.println(cls2);

        //3. 对象.getClass()  已经存在对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过类加载器(4种)来获取类的Class 对象
        ClassLoader classLoader = car.getClass().getClassLoader();// 获取类加载器
        Class<?> cls4 = classLoader.loadClass(fullPath); // 通过类加载器的 localClass 方法获取
        System.out.println(cls4);

        // 上面的 cls1，2，3，4 都是同一个

        //5.基本数据类型可以通过 .class 获取 Class 对象
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);

        //6.基本数据类型的包装类，可以通过 .TYPE 获取 Class 对象
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;

        System.out.println(type);
        System.out.println(type1);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());

    }
}
