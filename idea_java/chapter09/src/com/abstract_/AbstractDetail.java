package com.abstract_;

public class AbstractDetail {
    public static void main(String[] args) {

    }
}
abstract class AA {
    public abstract void say();
    public abstract void hi();
    public abstract void hello();
}
//当一个类继承于一个抽象类，则必须全部实现所有抽象方法,否则报错，除非该类也是abstract修饰
class BB {
    public void say() {
        System.out.println("BB say");
    }
    public void hi() {
        System.out.println("BB hi");
    }
    public void hello() {
        System.out.println("BB hello");
    }

}
