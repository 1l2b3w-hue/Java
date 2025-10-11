package com.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    public void f2() throws FileNotFoundException,NullPointerException,ArithmeticException
    { //抛出异常，让调用f2方法去处理
//        创建一个文件流对象
//        一个编译异常 ： FileNotFoundException
//        解决 ： try - catch 或 throws
//        throws 关键字后也可以是一个列表(异常列表)，抛出多个列表
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
