package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 选择匹配符
public class RegExp02 {
    public static void main(String[] args) {
//        String content = "hanshunping 韩 寒冷";
//        String regex = "han|韩|寒";

//        限定符
//        String content = "111111aaahellow";
//        String regex = "1*";

        String content = "a211";
        String regex = "a1?";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
