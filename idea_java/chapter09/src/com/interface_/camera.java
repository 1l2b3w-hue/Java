package com.interface_;

public class camera implements UsbInterface { //实现接口：实现接口的方法
    public void start() {
        System.out.println("照相机开始工作");
    }

    public void stop() {
        System.out.println("照相机停止工作");
    }
}
