package com.arrays_;

import java.util.Arrays;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {10,6,3,7,2,5,4,1,5,8,9};
        mySort(arr,new MyComparator() {
            public int compare(Object o1,Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
//                return i1 - i2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mySort(int[] arr,MyComparator c) {
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i -1 ; j++) {
                if(c.compare(arr[j],arr[j + 1]) > 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        选择排序
//        for(int i = 0; i < arr.length - 1; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(c.compare(arr[i], arr[j]) > 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//        }
//        }
        return arr;
    }
}
interface MyComparator {
    public int compare(Object o1,Object o2);
}
