package com.homework;

public class Homework06 {
    public static void main(String[] args) {
        Car car = new Car(-10);
        Car car1 = new Car(20);
        Car car2 = new Car(50);

        car.getAir().flow(car.getTemperature());
        car1.getAir().flow(car1.getTemperature());
        car2.getAir().flow(car2.getTemperature());

    }
}
