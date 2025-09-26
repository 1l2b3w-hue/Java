package com.modifier;

public class C {
    public void say() {
        modifier01 a = new modifier01();
// 同一个包中，只会允许访问public protected 默认修饰的属性和方法，不能访问到private修饰的属性和方法
        System.out.print("n1 = " + a.n1 + " n2 = " + a.n2 + " n3 = " + a.n3 );
    }
}
