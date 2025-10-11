package com.try_;

import java.util.Scanner;

public class TryCatchExercise02 {

    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        Scanner  scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.print("请输入一个整数：");
        while(flag) {
            try {
                int n = Integer.parseInt(scanner.next());
                System.out.println("你输入的整数为：" + n);
                flag = false;
            }catch(Exception e) {
                System.out.print("输入有误，请输入一个有效的整数:");
            }
        }
    }
//    public static void main(String[] args) {
//        System.out.print("请输入一个整数 ：");
//        m1();
//    }
//    public static void m1() {
//        Scanner  scanner = new Scanner(System.in);
//        try {
//            int n = Integer.parseInt(scanner.next());
//        }catch(Exception e) {
//            System.out.print("输入有误，请输入一个有效的整数:");
//            m1();
//        }
//        return;
//    }
}
