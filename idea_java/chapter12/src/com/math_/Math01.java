package com.math_;

public class Math01 {
    public static void main(String[] args) {
//        Math
//        常用方法
//        abs ：绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);

//        pow(int a,int b) : 求幂(a 的 b 次幂) (double)
        double pow = Math.pow(2,5);
        System.out.println(pow);

//        ceil() : 向上取整，返回大于等于该参数的最小整数 (double)
        double ceil = Math.ceil(10.00000001);
        System.out.println(ceil);

//        floor() : 向下取整，返回小于等于该参数的最小整数(double)
        double floor = Math.floor(3.9);
        System.out.println(floor);

//        round() : 四舍五入，floor(参数 + 0.5)
        long round = Math.round(3.3);
        System.out.println(round);

//       sqrt() : 求开方
        double sqrt = Math.sqrt(-9);
        System.out.println(sqrt);

//        random() : 随机数 ([0,1))
        for(int i= 0; i<10; i++){
//            2-7 生成一个a - b 之间的数 ： Math.random * (b - a + 1) + a
            int n = (int)((Math.random() * 6 + 2 ));
            System.out.println(n);
        }

//        max()最大值 、 min()最小值
        int max = Math.max(8,10);
        int min = Math.min(8,10);
        System.out.println("max: " + max + ", min: " + min);
    }
}
