package com.exercise_;

/**
 * 编写java程序，输入形式为：Han Shun Ping的人名，以Ping，Han.S的形式打印出来。其中.S是中间单词的首字母。
 *例如输入“Willian Jefferson Clinton"，输出形式为：Clinton，Willian.J
 */
public class Exercise03 {
    public static void main(String[] args) {
        String name = "Han Shun Ping";
        name = "Willian Jefferson Clinton";
        print(name);
    }
    public static void print(String str) {
        if(str == null) {
            System.out.println("字符串不能为null");
        }
        String[] split = str.split(" ");
        if(split.length != 3) {
            System.out.println("名字格式不对");
        }
        String format = String.format("%s,%s .%s",split[2],split[0],split[1].toUpperCase().charAt(0));
        System.out.println(format);
    }






//    public static void main(String[] args) {
//        String name = "Han Shun Ping" ;
//        name = "Willian Jefferson Clinton";
//        String newName = format(name);
//        System.out.println(newName);
//    }
//    public static String format(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        int startIndex = str.indexOf(" ");
//        int endIndex = str.lastIndexOf(" ");
//        char[] chars = str.toCharArray();
//        for(int i = endIndex; i < chars.length ; i++) {
//            stringBuilder.append(chars[i]);
//        }
//        stringBuilder.append(",");
//        for(int i = 0 ; i < startIndex ; i++) {
//            stringBuilder.append(chars[i]);
//        }
//        stringBuilder.append(".");
//        stringBuilder.append(chars[startIndex + 1]);
//
//
//        return stringBuilder.toString();
//    }
}
