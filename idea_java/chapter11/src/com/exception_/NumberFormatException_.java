package com.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "123";
//        String name = "韩顺平";
        int number = Integer.parseInt(name);

        System.out.println(number);
    }
}
