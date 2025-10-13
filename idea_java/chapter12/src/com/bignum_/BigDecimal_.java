package com.bignum_;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_ {
    public static void main(String[] args) {
//        当要保存一个浮点数的精度较高的数时，使用double就无法进行准确保存
        double d = 199.32554632524325456536765;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("199.32554632524325456536765");
        System.out.println(bigDecimal);
//        如果要对BigDecimal进行运算时，也必须使用相应方法
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        // 除法可能会抛出一个异常，当除不尽时，抛出ArithmeticException
//        System.out.println(bigDecimal.divide(bigDecimal1));
//        解决 ： 调用divide方法时，指定一个精度 ： BigDecimal.ROUND_CEILING(已经弃用)
//          使用RoundingMode.CEILING，会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1, RoundingMode.CEILING));
    }
}
