package com.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
//        append() : 在原先字符序列增加字符序列
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(",");
//        会自动将参数转变为字符串
        stringBuffer.append("张三丰").append(1000).append(true).append(22.5);
        System.out.println(stringBuffer); //Hello,张三丰1000true22.5

//        删除 delete(int a, int b)
//        删除索引在[a,b)之间的字符
        stringBuffer.delete(9,13);
        System.out.println(stringBuffer);//Hello,张三丰true22.5

//        改 ： replace(int a,int b ,String str)
//        将索引在[a,b)之间的字符序列替换成str
        stringBuffer.replace(6,9,"朱元璋");
        System.out.println(stringBuffer);//Hello,朱元璋true22.5

//        查 ：indexOf() 找出指定字串在字符串第一次出现的索引,找不到 ： -1
        int index = stringBuffer.indexOf("22");
        System.out.println(index);

//        插入 ： insert(int index,String str)
//        在指定索引位置插入指定字符串，索引后的内容往后移
        stringBuffer.insert(9,"朱标");
        System.out.println(stringBuffer);

//        查看长度 ： length();
        System.out.println(stringBuffer.length());
    }
}
