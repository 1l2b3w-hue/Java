package com.renthouse_new.service;

import com.renthouse_new.domain.House;
/**
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作(增删改查)
 * crud(creat read update delete)
 */
public class HouseService {
//    定义一个House[]，保存House对象
    private House[] houses;
    private int houseNum = 1;
    private int houseId = 1;
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1,"jack","123", "咸宁", 2000, "未出组");
    }

    /**
     * 接受一个id，查找数组中是否含有该id的房屋
     * @param id
     * @return
     */
    public House check(int id) {
        for(int i = 0; i < houseNum; i++) {
            if(id == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
//    public boolean check(int id) {
//        int index = -1;
//        for(int i = 0; i < houseNum;i++) {
//            if(id == houses[i].getId()) {
//                index = i;
//                break;
//            }
//        }
//        if(index == -1) {
//            System.out.println("没有查找道你输入的房屋id的房屋信息");
//            return false;
//        }
//        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出组/已出租)");
//        System.out.println(houses[index]);
//        return true;
//    }

    /**
     * 接受一个id，在houses数组中找到该id的房屋对象并删除
     * @param delId
     * @return
     */
    public boolean del(int delId) {
        int index = -1;
        for(int i = 0; i < houseNum;i++) {
            if(delId == houses[i].getId()){
                index = i;
                break;
            }
        }
        if(index == -1 ){
            System.out.println("没有找到你输入的房屋id，无法删除");
            return false;
        }
        for(int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
//        houses[houseNum - 1] = null; //置空最后一位
//        houseNum--; // 留出空位
    }

    /**
     * 接受一个House对象，并将该对象放入House数组中
     * @return
     */
    public boolean add(House newHouse) {
//        判断houses数组是否存放满了？
        if(houseNum == houses.length) {
           House[] newHouses = new House[houses.length + 1];
           for(int i = 0; i < houses.length;i++) {
               newHouses[i] = houses[i];
           }
           newHouses[houseNum++] = newHouse;
           setHouses(newHouses);
           newHouse.setId(++houseId);
           return true;
        }
//        向数组开始添加元素,
        houses[houseNum++] = newHouse;
//        设置用户为输入的房屋id
        newHouse.setId(++houseId);
        return true;
    }
    /**
     * 返回一个House数组，
     * @return
     */
    public House[] list() {
        return houses;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }
}
