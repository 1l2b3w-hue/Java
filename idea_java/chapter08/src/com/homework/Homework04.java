package com.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jack",400,28,1.2);
        Ordinary ordinary = new Ordinary("smith",200,28,1.0);
        manager.setBonus(1000);
        manager.printSalary();
        ordinary.printSalary();
    }
}
class Worker {
    private String name;
    private double daySal;
    private int workday;
    private double grade;
    public Worker(String name, double daySal, int workday,double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workday = workday;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary() {
        System.out.println("员工：" + name + "工资为 " + daySal * workday *grade );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }
}
class Manager extends Worker {
    private double bonus;
    public Manager(String name, double daySal, int workday,double grade) {
        super(name, daySal, workday,grade);

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void printSalary() {
        System.out.println("经理：" + getName() + "工资为 " + (getDaySal() *getWorkday() *getGrade()  +
                bonus));
    }
}
class Ordinary extends Worker {

    public Ordinary(String name, double daySal, int workday,double grade) {
        super(name, daySal, workday,grade);

    }
    public void printSalary() {
            super.printSalary();
    }
}