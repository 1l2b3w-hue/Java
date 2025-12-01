package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 非捕获分组
public class RegExp05 {

    public static void main(String[] args) {
        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

//        String regex = "韩顺平教育|韩顺平老师|韩顺平同学";
//        等价于非捕获分组:
//        String regex = "韩顺平(?:教育|老师|同学)";

//        查找韩顺平 关键字，但要求只是韩顺平教育和韩顺平老师中包含的韩顺平
//        String regex = "韩顺平(?=教育|老师)";

//        查找韩顺平 关键字，但要求不是韩顺平教育和韩顺平老师中的韩顺平
        String regex = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group(0));

        }

    }
}
