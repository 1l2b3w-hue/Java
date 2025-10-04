package com.homework;

public class Homework1 {
    public static void main(String[] args) {
        Person[] arry = new Person[3];
        arry[0] = new Person("Jack",20,"教师");
        arry[1] = new Person("smith",30,"工人");
        arry[2] = new Person("Tom",14,"学生");
        for(int i = 0; i < arry.length - 1; i++) {
            for(int j = 0; j < arry.length -i -1;j++) {
                if(arry[j].getName().length() > arry[j+1].getName().length()) {
                    Person temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arry.length;i++) {
            System.out.println(arry[i]);;
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}