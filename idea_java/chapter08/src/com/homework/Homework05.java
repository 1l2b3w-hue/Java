package com.homework;

import com.polyparameter_.Employee;

public class Homework05 {
    public static void main(String[] args) {
        labourer labourer = new labourer("jack",3000);
        farmer farmer = new farmer("smith",3000);
        Educator educator = new Educator("kang",5000);
        Scientist scientist = new Scientist("chen",10000,150000);
        Seriver seriver = new Seriver("jury",4500);
//        设置教师的上课天数和课时费
        educator.setLectureFree(120);
        educator.setClassDay(200);
//        设置老师和科学家的带薪月份
        educator.setSalMonth(13);
        scientist.setSalMonth(14);


        labourer.printSalary();
        farmer.printSalary();
        educator.printSalary();
        scientist.printSalary();
        seriver.printSalary();

    }
}
class NewEmpolyee2 {
    private String name;
    private double salary;
    private int salMonth = 12;//通过set方法灵活修改带薪月份

    public NewEmpolyee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printSalary() {
        System.out.println(name + "年工资：" + (salary * salMonth));
    }
}
class labourer extends NewEmpolyee2 {
    public labourer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSalary() {
        System.out.println("工人薪资：");
        super.printSalary();
    }

}
class farmer extends NewEmpolyee2 {
    public farmer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSalary() {
        System.out.println("农民薪资：");
        super.printSalary();
    }
}
class Educator extends NewEmpolyee2 {
//    动态更改教师的课时费和上课天数
    private double lectureFree;
    private int classDay;

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public Educator(String name, double salary) {
        super(name, salary);
    }

    public void printSalary() {
        System.out.println("教师薪资 :");
        System.out.println(getName() + "年工资：" +(getSalary() + lectureFree *classDay));
    }

    public double getLectureFree() {
        return lectureFree;
    }

    public void setLectureFree(double lectureFree) {
        this.lectureFree = lectureFree;
    }
}
class Scientist extends NewEmpolyee2 {
    private double yearBonus;

    public void printSalary() {
        System.out.println("科学家薪资");
        System.out.println(getName() + "薪资" +(getSalary() + yearBonus) );
    }
    public double getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(double yearBonus) {
        this.yearBonus = yearBonus;
    }

    public Scientist(String name, double salary, double yearBonus) {
        super(name, salary);
        this.yearBonus = yearBonus;
    }
}
class Seriver extends NewEmpolyee2 {
    public Seriver(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("服务员薪资：");
        super.printSalary();
    }
}