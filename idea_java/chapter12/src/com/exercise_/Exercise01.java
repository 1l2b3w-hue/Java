package com.exercise_;

//        将字符串中指定部分进行反转。比如将"abcdef"反转为"aedcbf"
//        编写方法public staticString reverse(String str,int start，int end)搞定
public class Exercise01 {
    public static void main(String[] args) {
        String str = "what are you ?gniod";
        String reverseStr = null;
        try {
            reverseStr = reverse(str,13,18);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(reverseStr);
    }
    public static String reverse(String str,int start,int end) {

//        参数验证 (一个重要思想 ： 列出正确情况再取反)
        if(!(str != null && start >= 0 && end < str.length() && start < end)) {
            throw new RuntimeException("参数异常");
        }
        char[] chars = str.toCharArray();
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
//    public static String reverse(String str,int start,int end) {
//        if(str == null) {
//            return null;
//        }
//        if(end <= start || start < 0 || end >= str.length()) {
//            return str;
//        }
//        StringBuffer stringBuffer = new StringBuffer(str);
//        while(start < end) {
//            char temp = stringBuffer.charAt(start);
//            stringBuffer.setCharAt(start,stringBuffer.charAt(end));
//            stringBuffer.setCharAt(end,temp);
//            start++;
//            end--;
//        }
//        while(start < end) {
//            char startIndex = stringBuffer.charAt(start);
//            char endIndex = stringBuffer.charAt(end);
//            stringBuffer.replace(start,start + 1, String.valueOf(endIndex));
//            stringBuffer.replace(end,end + 1,String.valueOf(startIndex));
//            start++;
//            end--;
//        }
//        while (start < end) {
//            Character startIndex = stringBuffer.charAt(start);
//            Character indexEnd = stringBuffer.charAt(end);
//            stringBuffer.replace(start,start + 1, indexEnd.toString());
//            stringBuffer.replace(end,end + 1,startIndex.toString());
//            start++;
//            end--;
//
//        }
//        StringBuffer stringBuffer = new StringBuffer(str);
//        StringBuffer stringBuffer1 = new StringBuffer();// 接受逆转的字符串;
//        for(int i = end; i >= start; i--) {
//            stringBuffer1.append(str.charAt(i));
//        }
//        stringBuffer.replace(start,end+1,stringBuffer1.toString());
//        return stringBuffer.toString();
//    }
}
