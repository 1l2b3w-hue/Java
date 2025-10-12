package com.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
//        StringBuffer 的直接父类 ：AbstractStringBuilder
//        实现了Serializable(可以串行化)，Comparable
//        在父类中，存在属性byte[] value;来存放内容(存放在堆中)，并没有final修饰
//        StringBuffer 是final类，不能被继承
        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
