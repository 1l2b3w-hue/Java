package com.lbw.view;

import com.lbw.domain_.DingTable;
import com.lbw.domain_.Employee;
import com.lbw.service.DingTableService;
import com.lbw.service.EmployeeService;
import com.lbw.utils.Utility;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MHLView {
    private EmployeeService employeeService = new EmployeeService();
    private DingTableService dingTableService = new DingTableService();
    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    // 显示主菜单
    public void mainMenu() {
        boolean flap = true;
        do{
            System.out.println("========== 满汉楼 ==========");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.print("请输入你的选择：");
            int i = Utility.readInt();
            switch (i) {
                case 1:
                    System.out.print("请输入员工号：");
                    String empID = Utility.readString(10);
                    System.out.print("请输入密  码：");
                    String password = Utility.readString(10);
                    Employee employee = employeeService.getEmployeeByEmpIdAndPwd(empID, password);
                    // 先将密码固定住，后续从数据库进行读取
                    if(employee != null) {
                        System.out.println("========== 登入成功["+ employee.getName() + "]==========");
                        secondMenu();
                    }
                    else {
                        System.out.println("========== 登陆失败 ==========");
                    }

                    break;
                case 2: flap = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while(flap);
        System.out.println("退出满汉楼系统");

    }

    public void secondMenu() {
        boolean loop = true;
        while(loop) {
            System.out.println("========== 满汉楼二级菜单 ==========");
            System.out.println("\t\t 1 显示餐桌状态");
            System.out.println("\t\t 2 预定餐桌");
            System.out.println("\t\t 3 显示所有菜品");
            System.out.println("\t\t 4 点餐服务");
            System.out.println("\t\t 5 查看账单");
            System.out.println("\t\t 6 结账");
            System.out.println("\t\t 9 退出满汉楼");
            System.out.print("请输入你的选择：");
            String key = Utility.readString(1);
            switch (key) {
                case "1":
                    showTableState();
                    break;
                case "2":
                    System.out.println("预定餐桌");
                    break;
                case "3":
                    System.out.println("显示所有菜品");
                    break;
                case "4":
                    System.out.println("点餐服务");
                    break;
                case "5":
                    System.out.println("查看账单");
                    break;
                case "6":
                    System.out.println("结账");
                    break;
                case "9":
                    System.out.println("退出满汉楼");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;

            }
        }
    }

    public void showTableState() {
        List<DingTable> dingTables = dingTableService.getDingTable();
        System.out.println("餐桌编号\t\t餐桌状态");
        for (DingTable dingTable : dingTables) {
            System.out.println(dingTable.getId() + "\t\t\t" + dingTable.getState());
        }
        System.out.println("========== 显示完毕 ==========");
    }
}
