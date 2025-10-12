package com.stringbuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {
//        构造器的使用
//        1.会创建一个长度位16的byte数组，用来存放字符序列
        StringBuffer stringBuffer = new StringBuffer();

//        通过构造器创建指定大小的byte数组存放字符序列
        StringBuffer stringBuffer1 = new StringBuffer(20);

//      创建一个长度为 ： str.len + 16 长度的byte数组存放字符序列
        StringBuffer stringBuffer2 = new StringBuffer("Hello World");

    }
}
