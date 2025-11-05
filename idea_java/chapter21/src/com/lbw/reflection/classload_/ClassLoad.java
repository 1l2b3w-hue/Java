package com.lbw.reflection.classload_;

/**
 * 类加载的初始化阶段
 */
public class ClassLoad {
    public static void main(String[] args) {
        /*
            加载 ： 生成 B 的 class对象
            链接 ：num = 0
            初始化阶段 ：
                依次自动收集类中所有静态成员的赋值动作和静态代码快中的语句，并合并
            clinit() {
                System.out.println("B static block");
                num = 300;
                num = 100;
            }
            经过合并后
            clinit() {
                System.out.println("B static block");
                num = 100;
            }
         */
        new B();
    }
}
class B {
    static {
        System.out.println("B static block");
        num = 300;
    }
    static int num = 100;
    public B() {
        System.out.println("B constructor");
    }
}
