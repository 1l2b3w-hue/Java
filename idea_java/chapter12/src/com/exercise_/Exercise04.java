package com.exercise_;

import java.util.Scanner;

/**
 * 输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String input = scanner.next();
        letterNum(input);
    }
    public static void letterNum(String str) {
        if(str == null) {
            System.out.println("字符不能为空");
            return;
        }
        int maxLetter = 0;
        int minLetter = 0;
        int num = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '0' && chars[i] <= '9') {
                num++;
            }
            else if(chars[i] >= 'a' && chars[i] <= 'z') {
                minLetter++;
            }
            else if(chars[i] >= 'A' && chars[i] <= 'Z') {
                maxLetter++;
            }
        }
        System.out.println("该字符串一共有" + maxLetter + "大写字母，" + minLetter +
                "小写字母，" + num + "数字");
    }
}
