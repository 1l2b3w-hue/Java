package com.modifier;

public class B {
    public static void main(String[] args) {
        modifier01 modifier01 = new modifier01();
        modifier01.say(); //验证同类访问属性
//        验证同类访问方法
        modifier01.m2();
        modifier01.m3();
//        modifier01.m4();//不能访问
        System.out.println();
        C c = new C();
        c.say();//同包不同类

    }
}
//类只有public 和默认来进行修饰
class Tiger {

}
//protected class lion {}
//private class rabbit {}