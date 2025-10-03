package com.debug_;

public class Debug02 {
    public static void main(String[] args) {
//        演示数组越界
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
