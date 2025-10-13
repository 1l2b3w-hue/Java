package com.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod2 {
    public static void main(String[] args) {
        Integer[] integers = {1,2,90,123,567};
//      binarySearch() : 通过二分搜索进行查找，并返回下标，要求数组为有序数组
//        有序就行(大到小，小到大)，如果是无序的，将不能使用binarySearch
//        如果数组不存在该元素，返回负数(-(low + 1) 即这个数如果存在的话，下标+1的负数).
        int index = Arrays.binarySearch(integers,111);
        System.out.println(index);

//        copyOf() : 数组元素的复制
//        从integers 数组中拷贝 integers.length 个元素到newArray中
//        如果拷贝的长度大于原数组，将会在新数组的后面增加 null，
//        如果长度小于0，抛出异常NegativeArraySizeException
//        底层使用System.arraycopy()
        Integer[] newArray = Arrays.copyOf(integers,integers.length);
        System.out.println(Arrays.toString(newArray));

//        fill() : 数组元素填充
//        使用5 去填充num中的元素 (就把指定数组中的元素全部替换成指定元素)
        Integer[] num = {1,2,3};
        Arrays.fill(num,5);
        System.out.println(Arrays.toString(num));

//        equals() : 比较两个数组中的元素是不是完全一样
        Integer[] integers2 = {1,2,91,123,567};
        boolean equals = Arrays.equals(integers,integers2);
        System.out.println(equals);

//         
//        编译类型 ： List(接口)， 运行类型 ： java.util.Arrays$ArrayList (Arrays 中的静态内部类)
        List asList = Arrays.asList(integers);
        System.out.println(asList);
        System.out.println(asList.getClass());
    }
}
