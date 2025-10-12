package com.string_;

public class StringExercise03 {

}
class Test {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.print(test.str + " and ");
        System.out.println(test.ch);
    }
}