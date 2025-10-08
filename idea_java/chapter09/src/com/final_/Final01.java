package com.final_;

public class Final01 {

    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE = 0.10;

    }
}
final class A {

}
//class B extends A {
//}
class C {
    public final void h1() {

    }
}
class D extends C {
//    public void h1() {
//
//    }
}
class E {
    public final double TAX_RATE = 0.08;
}
class F {

    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.02;
    }
}