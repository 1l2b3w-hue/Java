package com.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b); // true
        System.out.println(c == b); // true
        B b1 = a; // 即便编译类型不一样，但是他们还是指向同一个对象，同一个地址
        System.out.println(b1 == a);

//        "hello".equals("hello");
//        Object
//        Integer
        String st1 = new String("hello");
        String st2 = new String("hello");
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

    }

}
class A extends B {

}
class B {

}