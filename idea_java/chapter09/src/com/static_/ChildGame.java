package com.static_;

public class ChildGame {
    public static void main(String[] args) {
//        定义一个变量，记录多少人参加了游戏
        int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
//        count++;
        child1.count++;


        Child child2 = new Child("蜘蛛精");
        child2.join();
//        count++;
        child2.count++;

        Child child3 = new Child("老鼠精");
        child3.join();
//        count++;
        child3.count++;

        System.out.println("一共" + Child.count + "加入了游戏");
        System.out.println("child1 = " + child1.count);
        System.out.println("child2 = " + child2.count);
        System.out.println("child3 = " + child3.count);

//        问题分析 ： count 独立与child对象；访问count很麻烦，无法使用到OOP
//        引出类变量和静态变量
    }
}
class Child {
    private String name;
//  定义一个变量count，是一个类变量(静态变量)，使用static修饰
//    最大的特点在于，count变量可以被Child类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
