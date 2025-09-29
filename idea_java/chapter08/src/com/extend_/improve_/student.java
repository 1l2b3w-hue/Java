package com.extend_.improve_;

//创建一个pupil和graduate的父类 ： student
public class student {
    //    共有属性
    public String name;
    public int age;
    private double score;

    //    共有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("考试结束");
        System.out.println("学生名  " + name + " 年龄" + age +
                " 成绩 " + score);
    }
}
