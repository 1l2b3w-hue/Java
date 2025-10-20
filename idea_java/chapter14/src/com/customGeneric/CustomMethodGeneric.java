package com.customGeneric;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.car2("宝马",100000); // 当调用方法时，编译器会根据参数类型 自动判断 R 与 T的类型
    }
}
class Car {
    public void car(){} // 普通方法
    public <R,T> void car2(R r, T t) { // 泛型方法
//        R、T是提供给泛型方法使用的

    }

    public static <Z> void run(Z z) {

    }

}
class Car2<T,R> {
    public void car() {}

    public <U,M> void car2(U u, M m) {} // 泛型方法，建议与类的标识符进行分开

    public void f(T t) {
//        并不是泛型方法，只是使用了泛型
    }
//   泛型方法可以使用方法本身的泛型，也可以使用泛型类的泛型
    public <K> void f2(T t, K k) {}
}