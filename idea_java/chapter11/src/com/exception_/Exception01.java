package com.exception_;

/**
 * 引入异常处理机制
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
//        Throwable
//        当程序执行到num1 / num2 时，程序将会抛出(出现)异常
//        当抛出异常后，程序崩溃退出，不在执行后续代码
//        对于程序发生某个非致命性的问题从而导致整个程序崩溃，这并不友好
//        于是java设计者退出异常处理机制来解决这个问题
//        当程序员认为某段代码可能发生异常/问题时，可以使用try-catch来处理，从而保证代码健壮性
//        快速生成try-catch ： 选中：clt + alt + t
        try { // 进行尝试，如果try中的代码发生异常，使用catch捕获该异常，然后执行
//            catch中的代码后继续执行后面代码
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("出现异常原因 ：" + e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}
