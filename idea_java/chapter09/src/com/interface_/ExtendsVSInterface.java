package com.interface_;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LitterMonkey wukong = new LitterMonkey("悟空");
        wukong.climb();
        wukong.swimming();
        wukong.flying();
    }
}
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climb() {
        System.out.println(name + " 会爬树...");
    }
}
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}
class LitterMonkey extends Monkey implements Fishable, Birdable {
    public LitterMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习，会在水里游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习，会在天空飞翔");
    }
}
