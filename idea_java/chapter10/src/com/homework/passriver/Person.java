package com.homework.passriver;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
//    将过河和赶路封装成方法，通过调用方法的形式来进行描述赶路情况
//    引出新问题 ：通过构造器创建的交通工具没有使用
    public void passRiver() {
//        于是乎，进行一个小判断，看是不是有一个交通工具，符不符合过路条件，符合调用方法
//        不行就获取一个交通工具再调用

        if(!(vehicles instanceof Boat)) { // 判断是不是船，是就调方法，不是就获取船
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

//        if(vehicles instanceof Boat){ //跟上面一样，但是太多了，
//            vehicles.work();
//            return;
//        }
//        vehicles = VehiclesFactory.getBoat();
//        vehicles.work();


//        Boat boat = new Boat();
//        boat.work();

    }
    public void common() {
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();


//        if(vehicles instanceof Horse){
//            vehicles.work();
//            return;
//        }
//        vehicles = VehiclesFactory.getHorse();
//        vehicles.work();



//        Horse horse = new Horse();
//        horse.work();
    }
    public void fly() {
        if(!(vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }

}
