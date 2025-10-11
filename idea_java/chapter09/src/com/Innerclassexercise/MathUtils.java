package com.Innerclassexercise;

public class MathUtils {
    static class Calculator {
        public static int getSum(int a,int b) {
            return a + b;
        }
        public static int getMax(int[] arr) {
            int max = Integer.MIN_VALUE;
            if(arr == null ) {
                return max;
            }
            for(int i : arr) {
                if(i > max) {
                    max = i;
                }
            }
            return max;
        }
    }
}
