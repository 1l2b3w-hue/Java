package com.homework;

public enum Color implements ColorShow {
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private  int redValue;
    private  int greenValue;
    private  int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    public  void show() {
        System.out.println("redValue: " + redValue);
        System.out.println("greenValue: " + greenValue);
        System.out.println("blueValue: " + blueValue);

    }


}
