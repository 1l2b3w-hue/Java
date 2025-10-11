package com.homework;

public class Homework05 {
    public static void main(String[] args) {
        Tool tool = new Tool();
        Person p1 = new Person("唐僧",tool.getHorse());
        p1.getVehicles().work();
        p1.changeVehicles(tool.getBoat());
        p1.getVehicles().work();

    }
}
interface Vehicles {
    public void work();
}
class Tool {
    public Horse getHorse() {
        return new Horse();
    }
    public Boat getBoat() {
        return new Boat();
    }
}
class Person {
    private String name;
    private Vehicles vehicles;
    public void changeVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }
}

class Horse implements Vehicles {
    public void work() {
        System.out.println("骑马");
    }
}
class Boat implements Vehicles {
    public void work() {
        System.out.println("坐船");
    }
}