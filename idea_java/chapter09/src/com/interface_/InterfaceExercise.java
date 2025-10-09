package com.interface_;

public class InterfaceExercise {

}
interface A_ {
    int x = 0;
}
class B {
    int x = 1;
}
class C1 extends B implements A_ {
    public void info() {
//        System.out.println(x); // 错误，x的引用不明确
        System.out.println(A_.x + " " + super.x );
    }


    public static void main(String[] args) {
        new C1().info();
    }
}
