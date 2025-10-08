package com.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        类加载情况：
//        创建对象实例时
//        AA aa = new AA();
//        子类创建实例对象，
        AA aa2 = new AA();

    }
}
// 默认初始化，显示初始化(静态)/代码块初始化(静态)，构造器初始化，方法初始化/显示字段初始化
class BB {
    static {
        id = 2;
        System.out.println("BB的静态代码块被加载！");
    }
    public static  int id = 1;
    public BB() {
        System.out.println(id);
    }


}
class AA extends BB{
    static {
        System.out.println("AA的静态代码块被加载！");
    }


}
