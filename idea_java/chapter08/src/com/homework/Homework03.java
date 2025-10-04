package com.homework;

import com.polyarr_.Teacher;

public class Homework03 {
    public static void main(String[] args) {
       Professor t1 = new Professor("Jack",35,"教授",5000,1.3);
       t1.introduce();
    }
}
class Teacher1{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public void introduce() {
        System.out.println(name + " " + age + " " + post + " " + salary + " " + grade);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Teacher1(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }
}
class Professor extends Teacher1 {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println(getName() + " " + getAge() + " " + getPost() + " " + getSalary());
    }
}
class DeputyPro extends Teacher1 {
    public DeputyPro(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println(getName() + " " + getAge() + " " + getPost() + " " + getSalary());
    }
}
class lecturer extends Teacher1 {
    public lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println(getName() + " " + getAge() + " " + getPost() + " " + getSalary());
    }
}