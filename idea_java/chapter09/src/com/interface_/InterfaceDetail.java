package com.interface_;

public class InterfaceDetail {
    public static void main(String[] args) {
//        new AA();
    }
}
interface AA {
    void hi();
    void hello();
}

class Cat implements AA {
    @Override
    public void hi() {

    }

    @Override
    public void hello() {

    }
}
abstract class Dog implements AA {}
