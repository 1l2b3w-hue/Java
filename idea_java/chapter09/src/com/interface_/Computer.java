package com.interface_;

public class Computer {

//    UsbInterface usbInterface 形参类型，
//    可以接受实现了该接口的类创建的对像实例
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();

    }
}
