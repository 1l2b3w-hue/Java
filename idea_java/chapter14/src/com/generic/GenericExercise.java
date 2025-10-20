package com.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        Student student1 = new Student("小明",10);
        Student student2 = new Student("小强",11);
        Student student3 = new Student("小花",10);
        HashSet<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(Student s : students) {
            System.out.println(s);
        }
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashMap<String,Student> map = new HashMap<String,Student>();
        map.put(student1.getName(),student1);
        map.put(student2.getName(),student2);
        map.put(student3.getName(),student3);

        Set<Map.Entry<String, Student>> entries = map.entrySet();
//        for (Map.Entry<String, Student> entry : entries) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        System.out.println("===========");
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }


    }
}
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
