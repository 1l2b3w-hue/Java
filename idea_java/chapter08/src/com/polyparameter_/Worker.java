package com.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("员工" + super.getName() + "开始工作");
    }
//    public void getAnnual() {
//        System.out.println("员工" + super.getName() +
//                "年工资为" + (super.getSalary() * 12));
//    }

    @Override
    public void getAnnual() {
        super.getAnnual();
    }
}
