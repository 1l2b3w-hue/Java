package com.interface_;

public class InterfaceDetail02 implements IB {
    public static void main(String[] args) {
        System.out.println(IB.a); // 直接访问 static
//        IB.a = 2; // 不能修改 ：final

    }
}
interface IB {
//    接口的属性只能是final，而且是public static final 修饰符
    int a = 1; // public static final int a = 1;
}
interface IC {

}
//一个类同时可以实现多个接口
class C implements IB,IC {
}
//接口不能继承其他类，但是可以继承多个别的接口
interface ID extends IB,IC {

}