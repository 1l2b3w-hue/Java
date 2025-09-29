package com.extend_;

public class Base extends TopBase {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("无参Base() ~");
    }
    public Base(String name,int age) {
//        存在默认的super()，实现调用父类的构造器完成父类初始化
        System.out.println("有参Base(String name,int age) ~");
    }
    public Base(String name) {
        System.out.println("有参Base(String name) ~");
    }

    public void test100() {
        System.out.println("test100() ~");
    }
    protected void test200() {
        System.out.println("test200() ~");
    }
    void test300() {
        System.out.println("test300() ~");
    }
    private void test400() {
        System.out.println("test400() ~");
    }
//    创建一个公共的方法来访问私有属性
    public int getN4() {
        return n4;
    }
//    创建一个公共方法来访问私有方法
    public void callTest400() {
        test400();
    }
}
