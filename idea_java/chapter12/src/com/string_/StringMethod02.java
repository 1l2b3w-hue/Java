package com.string_;

public class StringMethod02 {
    public static void main(String[] args) {
//        toUpperCase() : 转大写 (不会修改原字符串)
        String s = "heLLo";
        System.out.println(s.toUpperCase());
//        System.out.println(s);

//        toLowerCase() : 转小写(不会修改原字符串)
        System.out.println(s.toLowerCase());
//        System.out.println(s);

//        concat() ：拼接字符串
        String s1 = "唐僧";
        s1 = s1.concat("孙悟空").concat("猪八戒").concat("沙悟净");
        System.out.println(s1);

//        replace() : 替换字符串中的字符
        s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
        s1 = s1.replace("林黛玉","薛宝钗");
        System.out.println(s1);

//        split() : 分隔字符串，对于某些分隔字符，需要进行转义 ： | 、\\...
//        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
//        String[] splits = poem.split("，");
        String poem = "E:\\aaa\\bbb";
//        在对字符串进行分割，如果有特殊字符，需要加入转义符 ： /
        String[] splits = poem.split("\\\\");

        for(String m : splits) {
            System.out.println(m);
        }

//        toCharArryay() : 转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for(char c : chs) {
            System.out.println(c);
        }

//        compareTo() 比较两个字符串的大小，前者大返回正数，后者大返回负数(前字符减去后字符)，相等为0
//        长度相同，并且每个字符都相同，返回0
//        长度相同或不相同，在比较时，可以区分大小写，就返回 ： c1 - c2(c1 != c2)
//        如果前面的部分都相同，就返回str1.len - str2.len
        String a = "Jchn";
        a = "Jac"; // 如果两个字符串中的字符相同，但有字符串长度小于另一个长度，则通过长度相减
        a = "Jackabc";
        String b = "Jack";
        System.out.println(a.compareTo(b));

//        format() 格式字符串
        String name = "John";
        int age = 18;
        double score = 98.3 / 3;
        char gender = '男';
        String info = "我的姓名是：" + name + "年龄：" + age + "成绩为：" +
                score + "性别为" + gender + "。希望大家多多关照！";
        System.out.println(info);
//        %s(字符串替换) %d(整数) %.2f(小数，并保留2位小数点，四舍五入) %c(char) : 都是占位符，由后面的变量替换


        String formatStr = "我的姓名是%s,年龄是%d ,成绩是%.2f 性别是%c 。希望大家多多关照";
        String info2 = String.format(formatStr,
                name, age, score, gender);
        System.out.println(info2);
    }
}
