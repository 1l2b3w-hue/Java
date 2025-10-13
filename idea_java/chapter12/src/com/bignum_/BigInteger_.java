package com.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
//        当需要处理很大的数时，并且long不够使用时
//        可以使用BigInteger 类处理
//        long num = 1239999999999999999999l;
//        System.out.println(num);
        BigInteger bigInteger = new BigInteger("1239999999999999999999");
        System.out.println(bigInteger);
//        在对 BigInteger 进行加减乘除时，应该使用相应方法，不能直接使用符号
//        System.out.println(bigInteger + 1);
//        可以通过创建一个要操作的BigInteger，再调用相关方法进行运算
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger result = bigInteger1.add(bigInteger);
        System.out.println(result);
        result = result.subtract(new BigInteger("1000000"));
        System.out.println(result);
        result = result.multiply(new BigInteger("300"));
        System.out.println(result);
        result = result.divide(new BigInteger("12000"));
        System.out.println(result);
    }
}
