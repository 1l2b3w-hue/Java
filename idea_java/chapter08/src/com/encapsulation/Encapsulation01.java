package com.encapsulation;

import java.util.Scanner;

//请大家看一个小程序（Encapsulation01.java），不能随便查看人的年龄，工资
//等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
//年龄，必须在1-120，年龄，工资不能直接查看，name的长度在2-6之间
public class Encapsulation01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Jack");
        p1.setAge(33);
        p1.setSalary(4500);
//        p1.info();
        System.out.println( p1.getSalary());

    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    private String job;
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }
        else {
            System.out.println("名字的长度应该在2~6个字符");
        }
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if(age >= 0 && age <= 120) {
            this.age = age;
        }
        else {
            System.out.println("年龄必须要在0~120之间");
            this.age = 18;
        }
    }
    public int getAge() {
        return age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码查看薪资 ：");
        String input = scanner.nextLine();
        if(input.equals("1234")){
            return salary;
        }
        else {
            System.out.println("密码错误，不能查看");
            return -1;
        }

    }
    public void info() {
        System.out.println("name : " + name + " age : " + age +
                " salary : " + salary);
    }

}
