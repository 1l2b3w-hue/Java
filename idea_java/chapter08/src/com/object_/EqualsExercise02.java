package com.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        P p1 = new P("hello");
        P p2 = new P("hello");
        System.out.println(p1 == p2); // false
        System.out.println(p1.name.equals(p2.name)); // true
        System.out.println(p1.equals(p2)); // false

        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

    }

}
class P{
    public String name;

    public P(String name) {
        this.name = name;
    }
}
