package com.homework;

public class homework11 {
    public static void main(String[] args) {
        //向上转型
        Person3 p3 = new Student(); //编译看Person中有没有，调用还是Student
//        调用方法 ： run(student running) eat(eat)
        p3.run();
        p3.eat();
//        向下转型
        Student s3 = (Student)p3;
//        调用方法 ： run(student running) eat(eat) study(study)
        s3.run();
        s3.eat();
        s3.study();
    }
}
class Person3 {
    public void run() {
        System.out.println("run");
    }
    public void eat() {
        System.out.println("eat");
    }
}
class Student extends Person3 {
    public void run() {
        System.out.println("student running");
    }
    public void study() {
        System.out.println("study");
    }
}
