package com.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
    }
}
class Circle {
//    private final double PI = 3.14;
    private final double PI;
    private double radius;
    {
      PI = 3.14;
    };
    public Circle(double radius) {
//        PI = 3.14;
        this.radius = radius;
    }

    public void area() {

        System.out.println("Area = " +( PI * radius * radius ));
    }

    public int add(final int x) {
//        ++x;
        return x + 1;
    }
}
