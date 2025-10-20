package com.generic;

public class Genetic02 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("韩顺平"); // 将会使用 String 替换了 E
        person.t();
        Person<Integer> Person2 = new Person<Integer>(100);
        Person2.t();
    }
}
// 泛型的作用是 ：在类声明时，通过一个标识表示类中的某个属性的类型 ,具体的数据类型会在 编译期间确定
//或者某个方法的返回值或参数类型
class Person <E> {
//    String s;  //
    E s;// 表示该属性的数据类型在定义 Person 对象时指定，即编译期间确定 E 是啥

    public Person(E s) {  // 参数类型
        this.s = s;
    }
    public E getS() {
        return s;
    }
    public void t() {
        System.out.println(s.getClass());
    }
}
