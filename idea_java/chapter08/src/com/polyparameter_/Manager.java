package com.polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("管理员" + super.getName() + "开始指导员工工作");
    }
    public void getAnnual() {
        System.out.println("管理员" + super.getName() +
                "年工资为" + (super.getSalary() * 12 + bonus));
    }
}
