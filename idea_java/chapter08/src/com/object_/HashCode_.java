package com.object_;

public class HashCode_ {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = a;
//        两个引用，指向不同对象，其哈希值不同
        System.out.println(a.hashCode() == b.hashCode());
//        两个引用，指向同一个对象，其哈希值一致
        System.out.println(c.hashCode() == a.hashCode());
    }
}

class A {

}
