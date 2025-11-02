package com.qqclient.service;

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
}
