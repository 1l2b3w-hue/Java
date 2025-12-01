package com.lbw.regexp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 结巴去重
public class RegExp10 {

    public static void main(String[] args) {

        String content = "我....我要....学学学学....编程java!";

        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        System.out.println(content); //我我要学学学学编程java!

        pattern = Pattern.compile("(.)\\1+");
        matcher = pattern.matcher(content);

        // 使用反向引用 $ 来替换重复字符
        content = matcher.replaceAll("$1");
        System.out.println(content);

    }






//    static String regex = "(.)\\1+";
//    public static void main(String[] args) {
//        String content = "我....我要....学学学学....编程java!";
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(content);
//        while(matcher.find()) {
//            content = new RegExp10().deduplication(content);
//        }
//        System.out.println(content);
//    }
//
//
//    public  String deduplication(String str) {
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//        while(matcher.find()) {
//            if("....".equals(matcher.group())) {
//                str = str.replace(matcher.group(),"");
//            }
//            else {
//                str = str.replace(matcher.group(),matcher.group(1));
//            }
//
//        }
//        return str;
//
//    }


}
