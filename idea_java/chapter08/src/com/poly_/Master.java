package com.poly_;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }
//  通过多态机制，统一管理主人喂食
    public void feed(Animal animal,Food food) {
        System.out.println("主人" + name + "给" + animal.getName() +
                "喂" + food.getName() );
    }
//    public void feed(Dog dog,Bone bone) {
//        System.out.println("主人" + name + "给" + dog.getName() +
//                "喂" + bone.getName() );
//    }
//    public void feed(Cat cat,Fish fish) {
//        System.out.println("主人" + name + "给" + cat.getName() +
//                "喂" + fish.getName() );
//    }
}
