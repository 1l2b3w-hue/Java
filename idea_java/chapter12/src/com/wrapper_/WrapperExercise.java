package com.wrapper_;

public class WrapperExercise {
    public static void main(String[] args) {
//        public static Integer valueOf(int i) {
//        判断i 是不是在-128 ~ 127 之间,是,返回一个cache数组的对应值
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//        不是,就新建一个对象返回
//            return new Integer(i);
//        }
        Integer m1 = 1;
        Integer m2 = 1;
//        这里就都会指向同一个数组中的同一个值
        System.out.println(m1 == m2); // true

        Integer m3 = 128;
        Integer m4 = 128;
//        各自指向两个不同的Integer对象,
        System.out.println(m3 == m4); // false
    }
}
