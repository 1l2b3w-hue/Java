package com.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
//    对于编译异常，必须使用try-catch处理或者throws处理
//    对于运行异常，程序如果没有处理(没有显示处理)，默认使用throws处理
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        int n1 = 10;
        int n2 = 0;
        int res = n1 / n2;
    }
    public static void f1() throws FileNotFoundException {
//        f2() 抛出一个编译异常，即要求f1() 必须处理这个编译异常(try-catch 或 throws)
        f2();
    }
    public static void f2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }

    public static void f3() {
        f4();
    }
    public static void f4() throws ArithmeticException {

    }
}
class Father {
//    子类方法重写父类方法时，对异常处理规定
//    子类重写的方法所抛出的异常 要么与父类抛出的异常一致或者是父类异常的子类
    public void say() throws RuntimeException {

    }
}
class Son extends Father {
    public void say() throws NullPointerException {

    }
}