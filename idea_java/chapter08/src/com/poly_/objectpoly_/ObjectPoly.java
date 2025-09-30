package com.poly_.objectpoly_;

public class ObjectPoly {
    public static void main(String[] args) {
        Animal animal = new Dog();
//        Animal是编译类型(编译时的类型)，Dog是运行类型（运行时的类型）
        animal.cry(); //运行Dog类中的cry
//        此时编译类型还是Animal(定义时就确定，无法更改)，运行类型改为Cat
        animal = new Cat();
        animal.cry();
    }
}
