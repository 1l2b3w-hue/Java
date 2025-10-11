package com.Innerclassexercise;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(MathUtils.Calculator.getSum(15, 25));
        System.out.println(MathUtils.Calculator.getMax(new int[]{3, 8, 1}));
        int[] arr = null;
        System.out.println(MathUtils.Calculator.getMax(arr));

    }
}
