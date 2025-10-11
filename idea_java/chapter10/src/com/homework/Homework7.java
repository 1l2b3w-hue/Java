package com.homework;



public class Homework7 {
    public static void main(String[] args) {
        Color red = Color.RED;
        Color blue = Color.BLUE;
        Color green = Color.GREEN;

        switch(red) {
            case RED:
                System.out.println("red");
                red.show();
                   break;
            case BLUE:
                System.out.println("blue");
                blue.show();
                break;
            case GREEN:
                System.out.println("green");
                green.show();
                break;
        }

    }
}
