package com.stringbuffer_;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商品名称：");
        String name = scanner.next();
        System.out.print("请输入商品价格：");
        try {
            double price = scanner.nextDouble();
            StringBuffer stringBuffer = new StringBuffer(Double.toString(price));
            int lastIndex = stringBuffer.lastIndexOf(".");
            while(lastIndex - 3 > 0) {
                stringBuffer.insert(lastIndex -3 ,",");
                lastIndex -= 3;
            }
            stringBuffer.insert(0,name);
            stringBuffer.insert(name.length(),"\t");
            System.out.println("商品名\t商品价格");
            System.out.println(stringBuffer);
        } catch (Exception e) {
            System.out.println("输入错误，请输入数值类型");
        }
    }
}
