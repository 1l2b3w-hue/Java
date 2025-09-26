package com.pkg;

//import java.util.Scanner; // 引入util包中的Scanner类
//import java.util.*; // 引入(导入)util包中的所有类


import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,6,9};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
