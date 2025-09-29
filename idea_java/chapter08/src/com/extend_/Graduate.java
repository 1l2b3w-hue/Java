package com.extend_;
//大学生考试
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
//    整体上，大学生的这个类的属性和方法与小学生这个类高度重复(除testing外)
    public void testing() {
        System.out.println("大学生" + name + "考高等数学");
    }
    public void showInfo() {
        System.out.println("考试结束");
        System.out.println("学生名 + " + name + " 年龄" + age +
                " 成绩 " + score);
    }
}
