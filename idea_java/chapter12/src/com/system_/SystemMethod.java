package com.system_;

import java.util.Arrays;

public class SystemMethod {
    public static void main(String[] args) {

//        exit() : 退出当前程序
//        参数 ：程序退出的状态， 0 表示正常状态
        System.out.println("ok1");
//        System.exit(0);
        System.out.println("ok2");

//        arraycopy()
        int[] arr = { 1, 2, 3 };
        int[] arr2 = new int[3];
//        参数 ： 源数组， 源数组拷贝起始位置，目标数组，目标数组起始位置，拷贝长度
        System.arraycopy(arr,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));
    }
}
