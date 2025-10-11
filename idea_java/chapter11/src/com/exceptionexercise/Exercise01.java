package com.exceptionexercise;

import java.util.Scanner;
//编写应用程序EcmDef.java，接收命令行的两个参数（整数），计算两数相除。
//计算两个数相除，要求使用方法cal（intn1，intn2）
//对数据格式不正确（NumberformatException）、缺少命令行参数
// (ArraylndexOutOfBoundsException)、除0进行异常处理（ArithmeticException)。
public class Exercise01 {
    public static void main(String[] args) {
//        先验证传入的参数个数
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确，应该为两个整数");
            }
//            转整数
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if(num2 == 0) {
                throw new ArithmeticException("除数为0！");
            }
            int res = num1 / num2;
            System.out.println("结果为 ：" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("数据格式不对！！");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int cal(int a,int b) {
        return a / b;
    }
}




//class EcmDef {
//    static int cal(int a,int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            if(args.length != 2) {
//                throw new IllegalArgumentException("错误请输入两个参数(整数)");
//            }
//            int a = Integer.parseInt(args[0]);
//            int b = Integer.parseInt(args[1]);
//            int res = cal(a,b);
//            System.out.println("结果为 = " + res);
//        } catch (NumberFormatException e) {
//            System.out.println("数据格式不对，必须为两个整数");
//        }catch(IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        catch (ArithmeticException e) {
//            System.out.println("除数不能为0");
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}