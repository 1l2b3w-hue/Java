package com.innerclass;

import java.sql.SQLOutput;

public class InnerExercise03 {
}
interface Calculator {
    int calc(int a,int b);
}
class CalculatorTest {
    public static void main(String[] args) {
        Calculator addcalc = new Calculator() {
            public int calc(int a,int b) {
                return a + b;
            }
        };
        System.out.println(addcalc.calc(3,4));
        int n2 = new Calculator() {
            public int calc(int a,int b) {
                return a - b;
            }
        }.calc(3,4);
        System.out.println(n2);
        Calculator mulcalc = new Calculator() {
            public int calc(int a,int b) {
                return a * b;
            }
        };
        System.out.println(mulcalc.calc(3,4));
        int n3 = new Calculator() {
            public int calc(int a,int b) {
                if(b == 0) {
                    System.out.println("除数不能为0");
                    return 0;
                }
                return a / b;
            }
        }.calc(8,4);
        System.out.println(n3);
    }

}
