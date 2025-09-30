package com.override_;

public class Dog extends Animal {
//    Dog是Animal的子类，并且say方法的名称、返回值、参数一致，为方法重写
    public void say() {
        System.out.println("小狗汪汪叫");
    }
}
