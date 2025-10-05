package com.homework;

public class homework13 {
    public static void main(String[] args) {
        Person4[] persons = new Person4[4];
        persons[0] = new Student2("jack",'男',16,"202501001");
        persons[1] = new Student2("smith",'男',17,"202501001");
        persons[2] = new Teacher2("Tom",'男',24,3);
        persons[3] = new Teacher2("jury",'男',45,20);
        persons[0].printinfo();
        System.out.println("----------------");
        persons[3].printinfo();
        for(int i = 0 ; i < persons.length - 1 ; i++){
            for(int j = 0 ; j < persons.length - 1 - i ; j++){
                if(persons[j].getAge() < persons[j+1].getAge()){
                    Person4 p4 = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = p4;
                }
            }
        }
        homework13 homework13 = new homework13();
        for(int i = 0 ; i < persons.length ; i++){
            System.out.println(persons[i]);
            homework13.test(persons[i]);

        }
    }
    public void test(Person4 person) {
        if(person instanceof Student2){
            ((Student2)person).study();
        }
        else if(person instanceof Teacher2){
            ((Teacher2)person).teach();
        }
        else {
            System.out.println("nothing");
        }

    }
}
class Person4 {
    private String name;
    private char sex;
    private int age;

    public Person4(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String play() {
        return this.name + "爱玩";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age ;
    }
    public void printinfo() {
        System.out.println("姓名：" + name +"\n" +
                "年龄：" + age +"\n" +"性别：" + sex);
    }
}
class Student2 extends Person4 {
    private String stu_id;

    public Student2(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study() {
        System.out.println("我承诺，我会好好学习");
    }
    public String play() {
        return super.play() + "爱玩足球";
    }
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student2{" + super.toString() +
                " stu_id='" + stu_id + '\'' +
                '}';
    }
    public void printinfo() {
        System.out.println("学生的信息：");
        super.printinfo();
        System.out.println("学号 ：" + stu_id);
        study();
        System.out.println(play());
    }
}
class Teacher2 extends Person4 {
    private int workAge;

    public Teacher2(String name, char sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }
    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }
    public String play() {
        return super.play() + "爱玩象棋";
    }
    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Teacher2{" +super.toString() +
                " workAge=" + workAge +
                '}';
    }
    public void printinfo() {
        System.out.println("老师的信息：");
        super.printinfo();
        System.out.println("工龄 ：" + workAge);
        teach();
        System.out.println(play());
    }
}