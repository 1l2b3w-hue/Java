package com.homework.passriver;

public class VehiclesFactory {
    private static  Horse horse = new Horse();
    public static Horse getHorse() {
        return horse;

//        问题来了，马是不用换的，但这里不断更新新的马
//        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
