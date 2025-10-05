package com.renthouse;

import java.util.Scanner;

public class Tools extends House {

    int houseNumber = getRef();
    Scanner scanner = new Scanner(System.in);
    public void menus() {
        boolean loop = true;
        int choice;
        do{
            System.out.println("------------房屋出租系统--------------");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退\t出");
            System.out.print("请选择(1-6):");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 :
                    addHouse();
                    showArry(getArry());
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    loop = false;
                    break;
                default :
                    System.out.println("输入有误，请重新输入");
            }
        }while(loop);
    }
    public void addHouse() {
        System.out.println("------------添加房屋--------------");
        houseNumber += 1;
        setRef(houseNumber);
        getArry() = new House[houseNumber];
        System.out.print("姓名：");
        String name = scanner.next();
        System.out.print("电话：");
        int number = scanner.nextInt();
        System.out.print("地址：");
        String address = scanner.next();
        System.out.print("月租：");
        Double monthRent = scanner.nextDouble();
        System.out.print("状态(未出组/已出租)：");
        String status = scanner.next();
        arry[houseNumber - 1] = new House(name,number,address,monthRent,status);
        setArry(arry);
        System.out.println("------------添加完成--------------");
    }
    public void showArry(House[] arry) {
        for(int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
    }
}
