package com.debug_;

public class Debug01 {
    public static void main(String[] args) {
        int res = 0;
        for(int i = 0; i < 5; i++) {
            res += i;
            System.out.println("i = " + i);
            System.out.println("res = " + res);
        }
        System.out.println("end...");
    }
}
