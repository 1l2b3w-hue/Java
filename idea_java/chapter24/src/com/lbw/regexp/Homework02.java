package com.lbw.regexp;
//要求验证是不是整数或者小数
public class Homework02 {
    public static void main(String[] args) {

        String regex2 = "^([-+]?)([1-9][\\d]*|0)(\\.\\d+)?$";

        String number = "-0.01";
        if(number.matches(regex2)) {
            System.out.println("整数或小数");
        }
        else  {
            System.out.println("匹配失败");
        }

    }
}
