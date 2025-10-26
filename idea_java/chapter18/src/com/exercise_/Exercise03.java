package com.exercise_;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Exercise03 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileReader("src\\dog.properties"));
        String name = prop.getProperty("name");
        int age = Integer.parseInt(prop.getProperty("age"));
        String color = prop.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\dog.dat"));
        oos.writeObject(dog);
        oos.close();

    }
    @Test
    public void input() throws Exception{
        String filePath = "d:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
//        System.out.println(ois.readObject());
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
