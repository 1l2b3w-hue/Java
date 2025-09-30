package com.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = getPeople();

        for(int i = 0; i  < persons.length; i++) {
//            怎么调用学生类的特定方法呢，先判断是不是学生，在向下转型调用
            if(persons[i] instanceof Student) {
                Student student = (Student)persons[i];
                student.study();
//                ((Student)persons[i]).study();
            }
            else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
//                ((Teacher)persons[i]).teach();
            }

//          存在动态绑定，编译类型会是Person，而运行类型将会由JVM按情况来确定
            System.out.println(persons[i].say());

        }

    }

    private static Person[] getPeople() {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("smith",22,60);
        persons[2] = new Student("smith2",22,75);
        persons[3] = new Teacher("tom",33,5000);
        persons[4] = new Teacher("tom2",34,5500);
        return persons;
    }
}
