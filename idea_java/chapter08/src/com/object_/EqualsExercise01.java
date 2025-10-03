package com.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("Jack",10,'男');
        Person person2 = new Person("Jack",10,'男');

        System.out.println(person1.equals(person2)); // 假(不重写时，直接判断是不是同一个对象)
    }
}

class Person {
    private String name;
    private int age;
    private char gender;
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {
            Person p = (Person)obj;
            if(p.getName() == this.name && p.getAge() == this.age && p.getGender() == this.gender) {
                return true;
            }
        }
        return false;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}