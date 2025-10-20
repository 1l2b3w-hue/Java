package com.generic;

import java.util.ArrayList;

public class GenericDetail {
    public static void main(String[] args) {

        // 给泛型指定数据类型时，不能是基本数据类型，只能为引用类型
        ArrayList<Integer> integers = new ArrayList<Integer>();
//        ArrayList<int> ints = new ArrayList<int>();

//        给泛型指定数据类型后，可以传入该类型或者该类型的子类类型
//        ArrayList<A> as = new ArrayList<A>();
//        as.add(new B());
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig1 = new Pig<>(new B());
        aPig1.f();

//        泛型定义形式
        ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 传统


        ArrayList<Integer> integers2 = new ArrayList<>(); // 简化，常用
//        编译器会进行类型推断，默认是右侧的 Integer

//        如果要求你传入一个泛型时，如果没有传入泛型，将会默认看成 Object
        ArrayList arrayList = new ArrayList();// 默认泛型为 Object
//        等价于
        ArrayList<Object> objects = new ArrayList<>();

        Tiger tiger = new Tiger();
        /*
            等价于 ：
            Tiger<Object> tiger = new Tiger<>();
         */
    }
}
class Tiger<E> {
    E e;

    public Tiger() {
    }

    public Tiger(E e) {
        this.e = e;
    }
}
class A {}
class B extends A{}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(e.getClass());
    }
}
