package com.qqclient.view;

import com.qqclient.service.ClientConnectServerThread;
import com.qqclient.service.FIleClientService;
import com.qqclient.service.MessageClientService;
import com.qqclient.service.UserClientService;
import com.qqclient.utils.Utility;
import org.junit.jupiter.api.Test;

/**
 * 客户端界面
 */
public class QQView {

    private boolean loop = true; // 用于控制循环
    private String key; // 接受用户键盘输入
    private UserClientService userClientService = new UserClientService(); // 用于登录服务器/注册用户
    private MessageClientService messageClientService = new MessageClientService(); // 用于用户私聊/群发
    private FIleClientService fileClientService = new FIleClientService(); // 用于用户文件传输服务
    public static void main(String[] args) {
        new QQView().mainMenu();
    }

//    显示主菜单
    private void mainMenu() {
        while(loop) {
            System.out.println("======== 欢迎登录网络通信系统 ========");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择：");
            key = Utility.readString(1);

            switch(key) {
                case "1" :
                    System.out.println("登录系统");
                    System.out.print("请输入用户名：");
                    String userId = Utility.readString(12);
                    System.out.print("请输入密码：");
                    String password = Utility.readString(12);
                    //接下来进行验证，将用户名与密码发送到服务端进行验证用户信息
                    // 代码较多，后面实现 创建一个类 UserClientService 专门处理用户登陆和注册

                    if(userClientService.checkUser(userId,password)) { // 先假设通过，后面增加
                        System.out.println("======== 欢迎用户" + userId+ "登录成功========");
                       while(loop) {
                           System.out.println("\n======== 网络通信系统二级菜单(用户" +
                                   userId+ ")========");
                           System.out.println("\t\t 1 显示在线用户列表");
                           System.out.println("\t\t 2 群聊消息");
                           System.out.println("\t\t 3 私聊消息");
                           System.out.println("\t\t 4 发送文件");
                           System.out.println("\t\t 9 退出系统");
                           System.out.print("请输入你的选择：");
                           key = Utility.readString(1);
                           switch(key) {
                               case "1" :{
//                                   System.out.println("显示在线用户列表");
                                   userClientService.onlineFriendsList();
                                   break;
                               }
                               case "2" :{
//                                   System.out.println("群聊消息");
                                   System.out.print("请输入你要群发的消息：" );
                                   String content = Utility.readString(100);
                                   messageClientService.sendMessageToAll(userId,content);
                                   break;
                               }
                               case "3" : {
//                                   System.out.println("私聊消息");
                                   System.out.print("请输入你想聊天的用户号(在线)：");
                                   String receiverId = Utility.readString(12);
                                   System.out.print("请输入你想说的话：");
                                   String receiveContent = Utility.readString(100);
                                   messageClientService.sendMessageToOne(userId, receiveContent, receiverId);

                                   break;
                               }
                               case "4" : {
//                                   System.out.println("发送文件");
                                   System.out.print("请输入你想把文件发送给的用户(在线):");
                                   String receiverId = Utility.readString(12);
                                   System.out.print("请输入你要发送文件的路劲(形式 d://xx.xx):");
                                   String src = Utility.readString(100);
                                   System.out.print("请输入你要发送到对方的哪个路劲(形式 d://xx.xx):");
                                   String dest = Utility.readString(100);
                                   fileClientService.sendFileToOne(dest,src,userId,receiverId);
                                   break;
                               }
                               case "9" : {
//                                   System.out.println("退出系统");
                                   // 调用方法实现向服务端发送退出系统请求
                                   userClientService.logout();
                                   loop = false;
                                   break;
                               }
                           }
                       }
                    }
                    else {
                        System.out.println("登录失败");
                    }
                    break;
                case "9" :
                    loop = false;
                    System.out.println("退出系统");
                    break;
            }
        }
    }
}
