package com.lbw.regexp;

import java.util.regex.Pattern;

public class PatternMethod {
    public static void main(String[] args) {
//        matches : 用于整体匹配，用于验证输入字符串是否满足使用条件
        String input = "hi,hello abc hello 韩顺平";
        String regex = ".*hello.*";

        boolean matches = Pattern.matches(regex,input);
        System.out.println("整体匹配" + matches);
    }
}
