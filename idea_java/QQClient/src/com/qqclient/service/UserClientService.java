package com.qqclient.service;

import com.qqclient.utils.Utility;
import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 处理用户登陆验证和用户注册等功能
 */
public class UserClientService {
//  因为后面可能经常使用 user 对象，这里就加入一个 user 对象属性
    private User user = new User();
//    因为Socket 在其他地方使用，因此有作为一个属性
    private Socket socket;
    /**
     * 根据 userId 和 Password 到服务器进行验证用户是否合法
     * @param userId
     * @param password
     * @return
     */
    public boolean checkUser(String userId ,String password) {
        boolean b = false;
        user.setUserId(userId);
        user.setPassword(password);
//        链接服务端发送 user 对象
        try {
            socket = new Socket(InetAddress.getByName("10.100.1.112"), 9999);

//            使用 对象流发送 user 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);

//            读取服务端返回到消息
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message msg = (Message)ois.readObject();

            if(msg.getMsgType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {


//                创建一个和服务器端保持通信的线程 ->  创建线程类 ClientConnectServerTread
                ClientConnectServerThread clientConnectServerThread  = new ClientConnectServerThread(socket);
//                启动客户端现场，实现与服务端的连接
                clientConnectServerThread.start();
//                为了后面客户端的扩展，我们将线程放入到集合中进行管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId,clientConnectServerThread);

                b = true;
            }
            else {
//              如果登录失败，就无法获得与服务器端通信的线程，于是关闭 socket
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return b;
    }


//    编写一个方法，用于实现向服务端请求一个在线用户信息列表
    public void onlineFriendsList() {
        // 创建一个 消息 对象
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_GET_ONLINE_FRIENDS); // 设置信息类型
        message.setSender(user.getUserId()); // 设置发送方

        try {
            // 准备发送信息，获取与之关联的 socket 对象
            // 直接属性获取 (只能处理单链接，即一个客户端一个连接)
//            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            // 通过线程的 userId 获取线程 (处理一个客户端多个连接问题，精准找到 所需socket 对象)
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(user.getUserId());
            // 获取当前线程的 socket 对象
            Socket socket = clientConnectServerThread.getSocket();
            // 获取 一个与socket 关联的对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
//     编写一个方法，退出客户端，并向向服务端发送退出系统 的 message
    public void logout() {
        Message message = new Message();
        message.setSender(user.getUserId());
        message.setMsgType(MessageType.MESSAGE_CLIENT_EXIT);

        // 获取关联的socket
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
            System.out.println(user.getUserId() + " 退出系统");
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
