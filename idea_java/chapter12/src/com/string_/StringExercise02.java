package com.string_;

public class StringExercise02 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s3 = "hspedujava";
        String s4 = (s1 + s2).intern();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
