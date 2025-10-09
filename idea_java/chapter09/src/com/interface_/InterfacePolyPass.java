package com.interface_;

/**
 * 接口多态传递
 */

public class InterfacePolyPass {
    public static void main(String[] args) {

        IG ig = new Teacher();
//        如果IG继承了IH接口，而Teacher实现了IG这个接口，
//        那么就相当于Teacher也实现了IH接口
        IH ih = new Teacher();
    }
}
interface IH {
    void hi();
}
interface IG extends IH{ } // 类似于Teacher类也实现了IH接口
class Teacher implements IG {
    public void hi() { // 必须要实现IH的抽象方法
        System.out.println("Teacher");
    }
}