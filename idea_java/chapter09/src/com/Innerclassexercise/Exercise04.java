package com.Innerclassexercise;

public class Exercise04 {
    public static void main(String[] args) {
        GeometryUtils geometryUtils = new GeometryUtils();
        geometryUtils.printShapeInfo(new Shape() {
            public double getArea() {
                return Math.PI * Math.pow(5.0, 2.0);
            }
            public double getPerimeter() {
                return 2 * 5 * Math.PI;
            }
        });
        geometryUtils.printShapeInfo(new Shape() {
            public double getArea() {
                return 8 * 4;
            }
            public double getPerimeter() {
                return (8 + 4) * 2;
            }
        });
    }
}
interface Shape {
    double getArea();
    double getPerimeter();
}
class GeometryUtils {
    public void printShapeInfo(Shape shape) {
        System.out.println("面积 = " + shape.getArea());
        System.out.println("周长 = " + shape.getPerimeter());
    }
}
