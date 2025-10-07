package com.renthouse_new.view;

import com.renthouse_new.utilitys.Utility;
import com.renthouse_new.service.HouseService;
import com.renthouse_new.domain.House;
/**
 * 1.显示界面
 * 2.接受用户输入的信息
 * 3.调用HouseService完成房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);

    /**
     *
     */
    public void update() {
        System.out.println("============修改房屋==============");
        System.out.print("请选择待修改房屋编号id(-1退出)：");
        int checkId = Utility.readInt();
        if(checkId == -1) {
            System.out.println("============退出修改房屋==============");
            return;
        }
        House house = houseService.check(checkId);
        if(house == null) {
            System.out.println("房屋ID不存在，无法进行修改");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");
        house.setName(Utility.readString(4,house.getName()));

        System.out.print("电话("+house.getPhone()+"):");
        house.setPhone(Utility.readString(4,house.getPhone()));

        System.out.print("地址("+house.getAddress()+"):");
        house.setAddress(Utility.readString(4,house.getAddress()));

        System.out.print("租金("+house.getRent()+"):");
        house.setRent(Utility.readInt(house.getRent()));

        System.out.print("状态("+house.getState()+"):");
        house.setState(Utility.readString(4,house.getState()));
        System.out.println("===========修改房屋完成==============");
    }

    /**
     * 接受用户输入的信息，返回查找到的房屋
     */
    public void checkHouse() {
        System.out.println("============查找房屋==============");
        System.out.print("请输入你要查找房屋的id：");
        int checkId = Utility.readInt();
        House house = houseService.check(checkId);
        if(house != null) {
            System.out.println(house);
            System.out.println("============查找完成==============");
        }
        else {
            System.out.println("============查找的id不存在==============");
        }
//        if(houseService.check(checkId)) {
//            System.out.println("============查找完成==============");
//            return;
//        }
//        System.out.println("============查找失败==============");
    }
    /**
     * 接受用户输入的信息，使用Utility的方法来判断是否终止循环
     */
    public void exitHouse() {
        System.out.println("请输入你的选择(Y/N)");
        char id = Utility.readConfirmSelection();
        if(id == 'Y') {
            loop = false;
        }
    }
    /**
     * 接受用户输入的信息，查找出指定id的房屋信息并删除(通过HouseService的del实现)
     */
    public void delHouse() {
        System.out.println("============删除房屋==============");
        System.out.print("请选择待删除房屋编号(-1退出)：");
        int choice = Utility.readInt();
        if(choice == -1 ){
            System.out.println("============退出删除房屋==============");
            return;
        }
        System.out.println("确认是否删除(Y/N): 请小心选择：");
        System.out.print("请输入你的选择(Y/N)");
        char id = Utility.readConfirmSelection();
        if(id == 'Y') {
            if(houseService.del(choice)) {
                System.out.println("============删除成功==============");
            }
            else {
                System.out.println("============删除失败==============");
            }
        }
        else {
            System.out.println("============退出删除房屋==============");
        }
    }

    /**
     *  接受用户输入信息，创建一个House对象并调用HouseService的add实现将对象存放在数组中
     */
    public void addHouse() {
        System.out.println("============添加房屋==============");
        System.out.print("姓名：");
        String name = Utility.readString(4);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt(3);
        System.out.print("状态(未出租/已出租):");
        String state = Utility.readString(3);
        House newHouse = new House(0,name,phone,address,rent,state);
        if(houseService.add(newHouse)) {
            System.out.println("============添加完成==============");
        }
    }


    /**
     * 接受来自HouseService对象list方法返回的一个数组并打印出来
     */

    public void listHouses() {
        System.out.println("============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出组/已出租)");
        House[] houses = houseService.list();
        for(int i = 0; i < houses.length; i++){
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }

    }
    public void mainMenu() {
        do{
            System.out.println("============房屋出租系统菜单==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请选择(1-6):");
            key = Utility.readMenuSelection();
            switch(key) {
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    checkHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    update();
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    exitHouse();
                    break;
            }
        }while(loop);
    }
}
