package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 验证url
public class RegExp08 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV1fh411y7R8?spm_id_from=333.788.player.switch&vd_source=6db0504bae8cafdb3583061a110f341b&p=894";
        content = "https://www.iconfont.cn/?spm=a313x.notifications.i3.2.1e123a81LosO3j";

//        分析 :
//         1. 确定开始部分 : http:// https://
//         2. ([\w-]+\.)+[\w-]+ 匹配 www.bilibili.com


        String regex = "^(?:http://|https://)([\\w-]+\\.)+[\\w-]+(/[\\w-.?=&%/#]*)?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        }
        else {
            System.out.println("不满足格式");
        }
    }
}
