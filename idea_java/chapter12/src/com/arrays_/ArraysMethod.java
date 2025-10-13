package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
    public static void main(String[] args) {

//        toString() : 返回数组的字符串形式
        Integer[] integers = {1,10,20,40};
        System.out.println(Arrays.toString(integers));

//        sort() : 排序数组 分默认排序和定制排序
//        定制排序 ： 传入一个接口Comparator实现定制排序(一个实现该接口的匿名内部类)
//                  两个参数 ： 一个是待排序数组，一个就是实现了Comparator接口的匿名内部类(实现compare方法)
//        执行流程 ：
//        先是Arrays.sort()方法，
//        进入TimSort类的private static <T> void binarySort(T[] a, int lo, int hi, int start,
//        Comparator<? super T> c)
//        代码执行binarySort方法时，会根据动态绑定机制执行我们传入的匿名内部类compare();
//        然后就是根据compare()的返回值来决定排列顺序
//        接口编程 + 动态绑定 + 匿名内部类 的综合使用

        Integer[] arr = {1,-1,7,0,89};
//        Arrays.sort(arr);// 默认排序
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
//                return i1 - i2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
