package com.interface_;

public class phone implements UsbInterface{
//    phone 类实现UsbInterface
//    phone需要实现UsbInterface接口 中规定/声明的方法
    public void start() {
        System.out.println("手机开始工作");
    }
    public void stop() {
        System.out.println("手机停止工作");
    }
}
