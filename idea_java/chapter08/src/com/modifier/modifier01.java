package com.modifier;

public class modifier01 {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
//    同类访问
    public void say() {
        System.out.print("n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3 + " n4 = " + n4);
    }
    protected void m2() {
        System.out.println("这是m2");
    }
    void m3() {
        System.out.println("这是m3");
    }
    private void m4() {
        System.out.println("这是m4");
    }
    public void hi() {
        say();
        m2();
        m3();
        m4();
    }
}
