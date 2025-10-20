package com.customGeneric;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
//接口中，静态成员不能使用泛型
//泛型接口的类型。在继承接口或实现接口是确定
interface IA extends Iusb<String, Double> { // U : String , R : Double

}
class AA implements IA {
    @Override
    public Double get(String s) {
        return 0.0;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void say(String s) {
        IA.super.say(s);
    }
}
class BB implements Iusb<Integer,Float> {
    @Override
    public Float get(Integer integer) {
        return 0f;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void say(Integer integer) {
        Iusb.super.say(integer);
    }
}
class CC implements Iusb {
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void say(Object o) {
        Iusb.super.say(o);
    }
}
interface Iusb<U,R> {
    int n = 0; // 默认 public static final
//    U name = "jack";
    // 普通方法中，可以使用泛型
    public R get(U u);
    void hi(R r);

    // 默认方法可以使用泛型
    default void say(U u) {
        System.out.println("U");
    }
}
