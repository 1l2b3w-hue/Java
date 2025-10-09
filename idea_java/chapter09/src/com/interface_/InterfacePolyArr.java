package com.interface_;

public class InterfacePolyArr {

    public static void main(String[] args) {
//        接口类型的数组(多态数组) (可以存放实现了该接口类的实例对象)
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for(int i = 0; i < usbs.length; i++) {
            usbs[i].work(); // 动态绑定
            if(usbs[i] instanceof Phone) {
                Phone phone = (Phone)usbs[i];//向下转型~
                phone.call();
            }
        }
    }

}
interface Usb {
    void work();
}
class Phone implements Usb {
    public void work() {
        System.out.println("Phone work");
    }
    public void call() {
        System.out.println("call");
    }
}
class Camera implements Usb {
    public void work() {
        System.out.println("Camera work");
    }
}
