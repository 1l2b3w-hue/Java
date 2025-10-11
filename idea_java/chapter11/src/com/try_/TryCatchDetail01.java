package com.try_;

public class TryCatchDetail01 {
    public static void main(String[] args) {
        // 当try中的代码抛出异常后，将直接调转到catch中，不会继续执行try中的后续代码
//         如果try中的代码没有抛出异常，将不会进入catch
//        如果想不管异常会不会发生异常，都想执行一段代码，就可以在后面增加finally
        try {
//            String str = "韩顺平";
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字 = " + a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());;
        }finally {
            System.out.println("finally");
        }
        System.out.println("程序继续执行...");
    }
}
