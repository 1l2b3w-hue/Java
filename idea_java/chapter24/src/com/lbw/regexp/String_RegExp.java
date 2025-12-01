package com.lbw.regexp;

public class String_RegExp {
    public static void main(String[] args) {
        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac" +
                "OSX的工业标准的支持。2001年9月24日，J2EE1.3发布。2002年2月26日，J2SE1.4发";

        String s = content.replaceAll("(JDK1\\.)(?:3|4)", "JDK");
        System.out.println(s);

        String phone = "13899999999";
        System.out.println(phone.matches("1(38|39)\\d{8}$"));

        String str = "hello#abc-jack12smith~北京";
        String[] split = str.split("#|-|~|\\d+");
        for(String str1 : split) {
            System.out.println(str1);
        }
    }
}
