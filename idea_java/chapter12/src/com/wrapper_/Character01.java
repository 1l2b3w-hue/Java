package com.wrapper_;

public class Character01 {
    public static void main(String[] args) {
        char a = 'a';
//        Character c1 = new Character(a);
        Character c = Character.valueOf(a);
        char b = c.charValue();

        Character d = a;
        char e = d;
        Object obj = true ? Integer.valueOf(1) : Double.valueOf(2.0);
        // 看成一个整体，先自动转换为最高精度：double，再转换
        System.out.println(obj);
    }
}
