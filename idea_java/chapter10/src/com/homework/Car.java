package com.homework;

public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    class Air {
        public  void flow(Double temp) {
            if(temp > 40) {
                System.out.println("开始吹冷风...");
            }
            else if(temp < 0) {
                System.out.println("开始吹暖气...");
            }
            else {
                System.out.println("关闭空调...");
            }
        }
    }
    public Air getAir() {
        return new Air();
    }


//    static class Air {
//
//        public static void flow(Double temp) {
//            if(temp > 40) {
//                System.out.println("开始吹冷风...");
//            }
//            else if(temp < 0) {
//                System.out.println("开始吹暖气...");
//            }
//            else {
//                System.out.println("关闭空调...");
//            }
//        }
//    }
}
