package com.renthouse;
import java.util.Scanner;


public class House {
    private String name;
    private int number;
    private String address;
    private double monthRent;
    private String status;
    private int ref  = 0;
    private House[] arry = new House[ref];
    public House() {

    }

    public House[] getArry() {
        return arry;
    }

    public void setArry(House[] arry) {
        this.arry = arry;
    }

    public House(String name, int number, String address, double monthRent, String status) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.monthRent = monthRent;
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(double monthRent) {
        this.monthRent = monthRent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equals("未出租") || status.equals("已出租")){
            this.status = status;
            return;
        }
        System.out.println("房屋状态输入错误，赋默认值：未出租，请及时修改！");
        this.status = "未出租";

    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                ", monthRent=" + monthRent +
                ", status='" + status + '\'' +
                ", ref=" + ref +
                '}';
    }
}
