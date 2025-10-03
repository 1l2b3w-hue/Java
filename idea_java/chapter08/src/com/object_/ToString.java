package com.object_;

public class ToString {
    public static void main(String[] args) {
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    } object 的toString() 源码
//    getClass().getName() ： 全类名    @ ：分割符
//    Integer.toHexString(hashCode()) 将对象的哈希值转为16进制
        Monster monster = new Monster("小妖怪","巡山",1000);
        System.out.println(monster.toString());
//        直接输出一个对象时，默认调用toString方法
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
