package com.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();

    }
}
class AAA {
    {
        System.out.println("AAA 普通代码块");
    };
    public AAA() {
        System.out.println("AAA 构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB 普通代码块被调用");
    };

    public BBB() {
//        1,super()
//        2，调用本类的普通代码块
        System.out.println("BBB 构造器被调用");
    }
}
