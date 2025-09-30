package com.override_;
//在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",18);
        Student student = new Student("smith",20,201,89.5);
        System.out.println(person.say());
        System.out.println(student.say());;
    }
}
