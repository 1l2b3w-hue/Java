package com.static_;

public class VisitStatic {
    public static void main(String[] args) {
//        访问类变量
        System.out.println(A.name);
        A a = new A();
        System.out.println(a.name);
//        System.out.println(A.count);
        System.out.println(a.count);

    }
}
class A {
//    类变量的访问还需要遵守相关的访问权限(具体看普通属性的访问权限)
    public static String name = "韩顺平教育";
    public int count = 0;
}
