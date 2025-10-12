package com.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
//        String --> StringBuffer
        String str = "hello";
//        利用构造器转换为StringBuffer ,返回的才是StringBuffer，对str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);
//        利用append()方法转换
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println(stringBuffer1);

//        StringBuffer --> Stirng
//        使用StringBuffer提供的toString()方法转换
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        String s = stringBuffer2.toString();
        System.out.println(s);
//        构造器转换
        String s1 = new String(stringBuffer2);
        System.out.println(s1);
    }
}
