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
                    break;
                case 2 :
                    checkHouse();
                    break;
                case 3 :
                    deleteHouse();
                    break;
                case 4 :
                    modifyHouse();
                    break;
                case 5 :
                    houselist();
                    break;
                case 6 :
                    System.out.println("请输入你的选择(Y/N)");
                    while(true) {
                        char opt = scanner.next().charAt(0);
                        if(opt == 'Y' || opt == 'y'){
                            loop = false;
                            break;
                        }
                        else if(opt == 'N' || opt == 'n') {
                            break;
                        }
                        else {
                            System.out.println("选择错误，请重新输入！");
                        }
                    }

                    break;
                default :
                    System.out.println("输入有误，请重新输入");
            }
        }while(loop);
    }
    public void addHouse() {
        System.out.println("------------添加房屋--------------");
        houseNumber += 1;
        House[] arry2 = new House[houseNumber];
        House[] arry3 = getArry();
        addArry(arry2,arry3);
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
        arry2[houseNumber - 1] = new House(name,number,address,monthRent,status);
        arry2[houseNumber - 1].setRef(houseNumber);
        setArry(arry2);
        System.out.println("------------添加完成--------------");
    }
    public void showArry(House[] arry) {
        for(int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
    }
    public void addArry(House[] a1,House[] a2){
        if(a2.length == 0) {
            return;
        }
        for(int i = 0; i < a2.length; i++) {
            a1[i] = new House(a2[i].getName(),a2[i].getNumber(),a2[i].getAddress(),a2[i].getMonthRent(),a2[i].getStatus());
            a1[i].setRef(a2[i].getRef()) ;
        }
    }
    public void checkHouse() {
        System.out.println("------------查找房屋--------------");
        boolean flag = true;
        System.out.print("请输入你要查找的房屋信息：(编号)");
        int checks = scanner.nextInt();
        House[] arry = getArry();
        for(int i = 0; i < arry.length;i++){
            if(checks == arry[i].getRef()){
                System.out.println("房屋信息如下：");
                System.out.println("姓名：" + arry[i].getName());
                System.out.println("电话：" + arry[i].getNumber());
                System.out.println("地址：" + arry[i].getAddress());
                System.out.println("月租：" + arry[i].getMonthRent());
                System.out.println("状态(未出组/已出租)：" + arry[i].getStatus());
                flag = false;
            }
        }
        if(flag) {
            System.out.println("没有找到对应编号的房屋！");
        }
        System.out.println("------------查找完成--------------");
    }

    public void deleteHouse() {
        System.out.println("------------删除房屋--------------");
        System.out.print("请输入代删除房屋编号(-1退出)：");
        int delref = scanner.nextInt();
        if(delref == -1) {
            return;
        }
        System.out.println("确认是否删除(Y/N):请小心选择：");
        System.out.print("请输入你的选择(Y/N):");
        String select = scanner.next();
        if(select.equals("N")) {
            return;
        }
        House[] arry = getArry();
        int key = -1;
        House[] arry2 = new House[arry.length - 1];
        for(int i = 0,j = 0; i < arry.length; i++) {
            if((delref - 1) == i) {
                key = i;
                continue;
            }
            arry2[j] = new House(arry[i].getName(),arry[i].getNumber(),arry[i].getAddress(),
                    arry[i].getMonthRent(),arry[i].getStatus());
            arry2[j].setRef(arry[i].getRef());
            j++;
        }
        if(key == -1) {
            System.out.println("目前没有找到你要删除的房屋信息");
            return;
        }
        setArry(arry2);
        System.out.println("------------删除完成--------------");
    }
    public void modifyHouse() {
        System.out.println("------------修改客户--------------");
        System.out.print("请选择待修改房屋编号(-1退出)：");
        int modref = scanner.nextInt();
        if(modref == -1) {
            return;
        }
        House[] arry = getArry();
        int key = -1;
        for(int i = 0; i < arry.length; i++) {
            if(modref == arry[i].getRef()) {
                key = i;
                break;
            }
        }
        System.out.print("姓名(" + arry[key].getName() + "):");
        arry[key].setName(scanner.next());
        System.out.print("电话(" + arry[key].getNumber() + "):");
        arry[key].setNumber(scanner.nextInt());
        System.out.print("地址(" + arry[key].getAddress() + "):");
        arry[key].setAddress(scanner.next());
        System.out.print("租金(" + arry[key].getMonthRent() + "):");
        arry[key].setMonthRent(scanner.nextDouble());
        System.out.print("状态(" + arry[key].getStatus() + "):");
        arry[key].setStatus(scanner.next());
        setArry(arry);

        System.out.println("------------修改完成--------------");
    }
    public void houselist() {
        System.out.println("-------------房屋列表----------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] arry = getArry();
        for(int i = 0; i < arry.length; i++) {
            System.out.println(arry[i].getRef() + "\t\t" + arry[i].getName() + "\t\t" + arry[i].getNumber() + "\t\t" +
                    arry[i].getMonthRent() + "\t\t" + arry[i].getStatus());
        }
        System.out.println("------------房屋列表完成--------------");
    }
}
