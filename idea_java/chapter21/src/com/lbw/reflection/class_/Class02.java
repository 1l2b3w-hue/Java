package com.lbw.reflection.class_;

import com.lbw.reflection.Car;

import java.lang.reflect.Field;

/**
 * 演示 Class 常用方法
 */
public class Class02 {
    public static void main(String[] args) throws Exception {
        String fullPath = "com.lbw.reflection.Car";
        // 1.获取 Car 类对应的 Class 对象
        // ? : 表示不确定的 java 类型，可以省略
        Class<?> cls = Class.forName(fullPath);
        //  2.输出 cls
        System.out.println(cls); // 显示 cls 对象，指的 哪个类的 Class 对象
        System.out.println(cls.getClass());// 显示 cls 对象的运行类型 java.lang.Class

        // 3.得到包名
        System.out.println(cls.getPackage().getName());

        // 4.得到全类名
        System.out.println(cls.getName());

        // 5. 通过 cls 创建对象
        Car car =(Car)cls.getDeclaredConstructor().newInstance();
        System.out.println(car);

        // 6. 通过反射获取某个属性(私有属性暂时无法获取)
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));

        // 7. 获取所有属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.get(car));
        }
    }
}
