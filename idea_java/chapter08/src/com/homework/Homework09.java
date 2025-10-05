package com.homework;

public class Homework09 {

}
class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class LabelPoint extends Point {
    String label;
    public LabelPoint(String label,double x,double y) {
        super(x,y);
        this.label = label;
    }
}