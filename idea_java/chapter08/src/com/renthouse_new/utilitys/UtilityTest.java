package com.renthouse_new.utilitys;

public class UtilityTest {
    public static void main(String[] args) {

        String s1 = Utility.readString(3);
        System.out.println(s1);

        String s2 = Utility.readString(6,"beauty");
        System.out.println(s2);
    }
}
