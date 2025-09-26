package com.pkg;

import com.modifier.modifier01;

public class Test {
    public static void main(String[] args) {
        modifier01 a = new modifier01();
//  不同包中进行访问时，只能访问到public修饰的属性和方法，
//  对于protected、默认、private修饰的方法和属性无法访问
        System.out.println("n1 = " + a.n1 );
        a.say();
//  对于不同类，只允许访问public的方法
//        a.m2();
//        a.m3();
//        a.m4();
    }
}
