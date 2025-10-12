package com.string_;

public class StringMethod01 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "HELLO";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        String str3 = "asdfffear2";
        int index = str3.indexOf("ff");
        System.out.println(index);

        String str4 = "hello,张三";
        System.out.println(str4.substring(6));
        System.out.println(str4.substring(0,5));
        System.out.println(str4.substring(2,5));
    }
}
