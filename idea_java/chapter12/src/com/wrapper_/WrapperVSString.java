package com.wrapper_;

public class WrapperVSString {
    public static void main(String[] args) {
//        Integer -- > String
        Integer integer = 100;
//        都不会改变原来integer类型
//        1.
        String str1 = integer + "";
//        2.
        String str2 = integer.toString();
//        3.
        String str3 = String.valueOf(integer);

//        String -- > Integer
        String str4 = "1234";
        Integer integer2 = Integer.parseInt(str4);
//        Integer integer3 = new Integer(str4);
        System.out.println("OK!");
    }
}
