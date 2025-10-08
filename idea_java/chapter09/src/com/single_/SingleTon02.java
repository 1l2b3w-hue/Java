package com.single_;

/**
 * 演示懒汉式单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
//        System.out.println(Cat.n1);
        Cat cat = Cat.getInstance();
        System.out.println(cat);

        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);

        System.out.println(cat == cat1);
    }
}

class Cat {
    private String name;
    private static Cat cat;
    public static int n1 = 100;

//    私有化构造器
//    静态属性对象
//    公共的静态方法返回Cat对象
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("大黄");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}