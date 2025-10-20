package com.customGeneric;

public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}
// Tiger 后接泛型，因此 Tiger 称为 自定义泛型类
//T,R,M ： 泛型标识符，创建对象时被确定，可以有多个泛型标识符，标识符通常为单个大写字母
//自定义泛型类的普通成员可以使用 泛型
//使用泛型数组不能进行初始化  因为泛型表示符只能在创建对象时才能得到确定，编译器都不知道表示符是啥类型，要开辟多少空间
// 静态方法不能使用泛型  静态方法是和类相关的，但泛型只会在创建对象的时候得到确定，静态成员都不知道是啥，
class Tiger<T,R,M> {
    String name;
    T t; // 属性使用到泛型
    R r;
    M m;
//    T[] ts = new T[8];
    public Tiger(String name, T t, R r, M m) { // 构造器使用到泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() { // 方法使用到泛型
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}