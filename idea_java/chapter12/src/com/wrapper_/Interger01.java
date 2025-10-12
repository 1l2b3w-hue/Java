package com.wrapper_;

/**
 * int < -- > Integer 的装箱和拆箱
 */
public class Interger01 {
    public static void main(String[] args) {
//      JDK 5 之前 ：手动装箱(基本数据类型 --> 包装类类型)拆箱 (包装类类型 --> 基本数据类型)
        int n = 10;
//        装箱：
//        Integer integer = new Integer(n);//已经弃用并标记移除(9~)
        Integer integer2 = Integer.valueOf(n);
//        拆箱：
        int n1 = integer2.intValue();

//        JDK5后自动装箱
        int n2 = 10;
        Integer integer3 = n2; // 底层 ：Integer.valueOf(n2);

        int n3 =integer3; // 底层 ：intValue();
    }
}
