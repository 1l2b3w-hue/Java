package com.renthouse_new;

import com.renthouse_new.view.HouseView ;

public class HouseRentApp {
    public static void main(String[] args) {
//        程序的入口，调用houseview显示主菜单
        new HouseView().mainMenu();
        System.out.println("=======退出房屋出租系统=======");
    }
}
