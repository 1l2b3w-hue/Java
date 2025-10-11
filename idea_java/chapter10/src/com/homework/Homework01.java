package com.homework;

public class Homework01 {

}
class Frock {
    private static int currentNum = 100000;
    private int serialNumber ;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
}
class TestFrock {
    public static void main(String[] args) {
        System.out.println("序列号 = " + Frock.getNextNum());
        System.out.println("序列号 = " + Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}

