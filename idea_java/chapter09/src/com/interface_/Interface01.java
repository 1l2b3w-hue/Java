package com.interface_;

public class Interface01 {
    public static void main(String[] args) {
//        实现手机和相机对象
        phone p = new phone();
        camera c = new camera();

        Computer computer = new Computer();

        computer.work(p);
        computer.work(c);
    }
}
class A implements AInterface {

//    必须实现接口中的所有抽象方法
    public void hi() {
        System.out.println("hi");
    }
}
