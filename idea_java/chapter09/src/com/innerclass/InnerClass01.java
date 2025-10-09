package com.innerclass;

public class InnerClass01 {

}
class Outer {
    private int n1 ;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void say() {
        System.out.println("hello");
    }
    {
        System.out.println("普通代码块");
    };
    class Inner {

    }
}