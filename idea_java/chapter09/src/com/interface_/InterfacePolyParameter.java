package com.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
//       接口的多态体现
//        接口类型的变量可以指向实现了该接口类的对象实例
        IF if1 = new Monster();
        if1 = new Car();

//        继承体现的一个多态
//        父类类型的变量可以指向子类类型的对象实例
        AAA a = new BBB();
        a = new CCC();
    }
}
interface IF {}
class Monster implements IF{}
class Car implements IF{}

class AAA {}
class BBB extends AAA {}
class CCC extends AAA {}