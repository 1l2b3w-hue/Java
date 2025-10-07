package com.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("Tom");
        stu.pay(5000);

        Stu stu1 = new Stu("mary");
        stu1.pay(5500);

        Stu.showFee();

    }
}
//记录所有学生交的学费
class Stu {
    private String name;
    public static double fee = 0.0;

    public Stu(String name) {
        this.name = name;
    }
    public void study() {

    }
    public static void pay(double fee) {
        Stu.fee += fee;
//        name = "123";
//        study();
    }
    public static void showFee() {
        System.out.println("总学费为 ： " + Stu.fee);
    }
}
