package com.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型 ：父类的引用指向了子类的对象
        Animal animal = new Cat();
//        Object obj = new Cat();
//        可以调用父类中的所有成员(要遵守访问权限)
//        但是无法调用子类的特有成员 (调用由编译器完成，此时编译器看到了animal，主动到
//        Animal类去寻找方法或属性，结构没找到啊，抛错)
//        animal.catchMouse()

//        最终执行结果看子类的具体实现
        animal.eat();
        animal.show();
        animal.run();
        animal.sleep();


//        多态的向下转型
        Cat cat = (Cat)animal;
        cat.catchMouse();
//        要求父类的引用必须指向当前目标类型的对象
//        Dog dig = (Dog)animal; // 怎么可能将猫当成狗呢？

    }
}
