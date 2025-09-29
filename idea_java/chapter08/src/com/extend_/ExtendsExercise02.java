package com.extend_;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        PC pc = new PC("123","16","512","DELL");
        Notepad notepad = new Notepad("asd","16","512","blue");
        pc.info();
        System.out.println("=====two=====");
        notepad.info();

    }
}

class Computer {
    private String CPU;
    private String memory;
    private String hardDisk;

    public Computer(String CPU, String memory, String hardDisk) {
        this.CPU = CPU;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetails() {
       return "CPU: " + CPU + ", memory: " +
                memory + ", hardDisk: " + hardDisk;
    }
}
class PC extends Computer {
    String brand;

    public PC(String CPU,String memory,String hardDisk,String brand) {
        super(CPU,memory,hardDisk);
        this.brand = brand;
    }
    public void info() {
        setCPU("123");
        setMemory("16");
        setHardDisk("512");

        System.out.println(getDetails() + "Brand: " + brand);
    }
}
class Notepad extends Computer {
    String color;

    public Notepad(String CPU,String memory,String hardDisk,String color) {
        super(CPU,memory,hardDisk);
        this.color = color;
    }
    public void info() {
        setCPU("asd");
        setMemory("16");
        setHardDisk("512");

        System.out.println(getDetails() + " Color: " + color);
    }
}
