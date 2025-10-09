package com.interface_;

public interface AInterface {
//    属性，方法都行
    public int n1 = 10;
//    接口中，抽象方法可以省略abstract
    public void hi();

    default public  void ok() {
        System.out.println("ok");
    }

    public static void hello() {
        System.out.println("hello");
    }
}
