package com.string_;

public class String01 {
    public static void main(String[] args) {
//        "Jack" : 就是字符串常量
//        字符串使用Unicode编码 ，一个字符占两个字节
//        String有多个构造器，实现了构造器的重载
//        实现了两个接口Serializable ： 串行化(网络传输)
//                    Comparable ： 相互比较
//        String是一个final类，不能被继承
//        String 有属性 ： private final char value[] : 存放字符串内容
//        value 被final修饰，不可以修改(是指地址不能修改，即value不能指向新的地址，但是单个字符可以被修改)
//        常用构造器
//        new String() ; new String(String original) ; new String(char[] a);
//        new String(char[] a,int startIndex,int count); new String(byte[] b)
        String name = "Jack";

        final char[] value ={'a','b','c','d','e','f'};
        value[0] = 'A';
        char[] arry = {'b','c','d','e','f'};
//        value = arry; //不能修改value的地址
    }
}
