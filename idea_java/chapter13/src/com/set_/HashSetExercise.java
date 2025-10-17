package com.set_;


import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Employee("Jack",25,2002,9,20));
        hashSet.add(new Employee("Jack",30,2002,9,10));
        hashSet.add(new Employee("Jack",25,2002,9,20));
        System.out.println("HashSet: " + hashSet);
    }
}
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "year=" + year + ", month=" + month + ", day=" + day;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
class Employee {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, int year,int month,int day) {
        this.name = name;
        this.age = age;
        birthday = new MyDate(year,month,day);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday :" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}