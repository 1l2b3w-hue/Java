package com.exception_;

public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = { 1,2,3};
        for (int i = 0; i <= arr.length; i++) { //越界错误
            System.out.println(arr[i]);
        }
    }
}
