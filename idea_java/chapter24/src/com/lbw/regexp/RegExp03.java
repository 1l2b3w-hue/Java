package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 演示定位符
public class RegExp03 {
    public static void main(String[] args) {
//        String content = "123abc";
//        以至少一个数字开头，后加0~n个小写字母的字符串
//        String regex = "^[0-9]+[a-z]*"; // 123abc
//        以至少一个数字开头，后接0~n个小写字母并以小写字母结尾的字符串
//        String regex ="^[0-9]+[a-z]+$";

        String content = "hanshunping sphan nnhan";

//        匹配出现在边界的 han 字符串； 边界 ： 后接空格或结尾
        String regex = "han\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }

}
