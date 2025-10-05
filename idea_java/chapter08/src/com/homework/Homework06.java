package com.homework;

public class Homework06 {
}
class Grand {
    String name = "AA";
    private int age = 100;
    public void g1() {

    }
}
class Father extends Grand {
    String id = "001";
    private double score;
    public void f1() {
//        super :name ,g1();
//        this :id score f1() name(grand) g1(grand)

    }
}
class Son extends Father {
    String name = "BB";
    public void g1() {
//        super : name(grand) id g1()(grand) f1()
//        this :id name(Son) g1(son) f1()
    }
}
