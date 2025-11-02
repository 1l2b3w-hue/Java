package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务器，监听 9999 号端口，等待客户端连接，并保持通信
 */

public class QQServer {
    private ServerSocket ss = null;
    // 使用 HashMap 来代替数据库存放合法用户
    // 可以使用 ConcurrentHashMap,存放，一个可以处理并发的集合，有线程安全，线程同步
    // HashMap 没有处理线程安全，因此在多线程情况下是不安全的
    private static ConcurrentHashMap<String,User> validUsers =new ConcurrentHashMap<>();

    static {
        validUsers.put("100",new User("100","123456"));
        validUsers.put("321",new User("321","123456"));
        validUsers.put("326",new User("326","123456"));
        validUsers.put("331",new User("331","123456"));
        validUsers.put("至尊宝",new User("至尊宝","123456"));
        validUsers.put("紫霞仙子",new User("紫霞仙子","123456"));
        validUsers.put("菩提老祖",new User("菩提老祖","123456"));
    }

    // 编写方法来验证用户登录时，用户是否又小
    private boolean checkUser(String userId,String password) {
//        if(validUsers.containsKey(userId) && password.equals(validUsers.get(userId).getPassword())) {
//            return true;
//        }
//        return false;
        User user = validUsers.get(userId);
        if(user==null) { // 说明 userId 没有存放在 ValidUsers 中
            return false;
        }
        if(!password.equals(user.getPassword())) { //密码不对
            return false;
        }
        return true;
    }

    public QQServer(){
//      监听的端口号可以写在配置文件中
        try {
            System.out.println("服务端在 9999 号端口进行监听...");
            ss = new ServerSocket(9999);
            while(true) {
//      这里是要求在与某个客户端连接后，要持续与客户端保持链接
                Socket socket = ss.accept();
                // 获取与 socket 相关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                // 获取与 socket 相关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                Message message = new Message();
                // 读取客户端发送的 user 对象
                User user = (User) ois.readObject();
                if(checkUser(user.getUserId(),user.getPassword())){
                    // 返回登陆成功的消息 Message
                    message.setMsgType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    // 发送 message
                    oos.writeObject(message);
                    // 然后要实现一个线程不断与某个客户端保持连接
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, user.getUserId());
                    serverConnectClientThread.start();
                    // 将该线程对象放入集合中进行管理
                    ManageClientThreads.addClientThread(user.getUserId(), serverConnectClientThread);
                }
                else  {
                    System.out.println("用户id = " + user.getUserId() +
                            " 密码=" + user.getPassword() + "验证失败");
                    // 返回登陆失败的消息
                    message.setMsgType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);

                    socket.close();
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //如果退出了 while 循环，表明服务器端停止了对 9999 端口进行监听，此时应该关闭serverSocket
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
