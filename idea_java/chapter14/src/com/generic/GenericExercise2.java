package com.generic;

import java.util.ArrayList;
import java.util.Comparator;
//定义Employee类
//1)该类包含：private成员变量name,sal,birthday，其中birthday为MyDate类的对
//象；
//        2）为每一个属性定义getter,setter方法；
//        3）重写toString方法输出name，sal,birthday
//4)MyDate类包含：private成员变量month，day.year；并为每一个属性定义getter,
//setter方法；
//        5）创建该类的3个对象，并把这些对象放入ArrayList集合中（ArrayList需使用泛
//型来定义），对集合中的元素进行排序，并遍历输出：
//排序方式：调用ArrayList的sort方法，传入Comparator对象[使用泛型]，先按照
//name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
public class GenericExercise2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jack",3000,10,20,2004));
        employees.add(new Employee("Jack",3000,9,20,2004));
        employees.add(new Employee("Smith",3500,9,20,2003));
        employees.add(new Employee("Mary",4000,10,5,2005));
        for(Employee e: employees) {
            System.out.println(e);
        }
        System.out.println("============");
        employees.sort(new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if(e1.getName().equals(e2.getName())) {
                    return e1.getBirthday().compareTo(e2.getBirthday());
                }
                return e1.getName().compareTo(e2.getName());
            }
        });

        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}
class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, int month, int day, int year) {
        this.name = name;
        this.sal = sal;
        this.birthday = new MyDate(month,day,year);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int compareTo(MyDate other) {
//        if(this.year < other.getYear()) {
//            return -1;
//        }
//        else if(this.year == other.getYear() && this.month < other.getMonth()) {
//            return -1;
//        }
//        else if(this.year == other.getYear() && this.month == other.getMonth() && this.day < other.getDay()) {
//            return -1;
//        }
//        else if(this.year == other.getYear() && this.month == other.getMonth() && this.day == other.getDay()) {
//            return 0;
//        }
//        return 1;
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        // 年份相同则比较月份
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        // 月份相同则比较日期
        return Integer.compare(this.day, other.day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}