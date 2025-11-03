package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 该类的一个对象用于与某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId; // 指明与服务器连接的客户端

    public ServerConnectClientThread(Socket socket, String uerId) {
        this.socket = socket;
        this.userId = uerId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() { // 不断读取客户端发送的信息和向客户端发送信息

       while(true) {
           try {
               System.out.println("服务端和客户端"+ userId +"保持通信，读取数据...");
               ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
               Message message = (Message) ois.readObject();
               // 后面处理 message
               // 判断 message 的类型，针对不同类型完成相应处理
               if(message.getMsgType().equals(MessageType.MESSAGE_GET_ONLINE_FRIENDS)) {
                   //  客户端请求获取在线用户信息列表
                   // 列表形式 为 ： 100 200 300....
                   System.out.println(userId + "请求访问在线用户信息列表");
                   // 获取在线用户信息列表字符串
                   String onlineUsers = ManageClientThreads.getOnlineUsers();
                   // 构建 消息对象
                   Message message2 = new Message();
                   message2.setMsgType(MessageType.MESSAGE_RET_ONLINE_FRIENDS);
                   message2.setContent(onlineUsers);
                   message2.setReceiver(message.getSender());
                   // 返回客户端
                   ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                   oos.writeObject(message2);
               }
               else if(message.getMsgType().equals(MessageType.MESSAGE_COMM_MESSAGE)) {
                    // 根据 message 获取 receiverId 然后在获取对应线程
                   String receiver = message.getReceiver();
                   ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(receiver);
                   // 获取对应 socket 的对象输出流，将 message 发送给指定客户端
                   ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                   oos.writeObject(message); // 如果 客户端不在线，可以保存到数据库，从而实现离线留言的功能

               }else if(message.getMsgType().equals(MessageType.MESSAGE_TO_ALL)) {
                   // 通过集合来获取所有在线用户
                   HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
                   Iterator<String> iterator = hm.keySet().iterator();

                   while(iterator.hasNext()) {
                       String key = iterator.next();
                       if(!key.equals(message.getSender())) {
                           ObjectOutputStream oos =
                                   new ObjectOutputStream(hm.get(key).getSocket().getOutputStream());
                           oos.writeObject(message);
                       }
                   }


               }
               else if(message.getMsgType().equals(MessageType.MESSAGE_FILE_MSG)) {
                    // 根据接受方 id 获取指定线程，写入消息
                   ObjectOutputStream oos = new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(message.getReceiver()).getSocket().getOutputStream());
                   oos.writeObject(message);
               }
               else if(message.getMsgType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                   System.out.println(message.getSender() + "退出系统");
                   // 将该客户端对应线程 从集合中移除
                   ManageClientThreads.removeClientThread(message.getSender());
                   socket.close(); // 关闭连接
                   break; // 退出循环
               }
               else {
                   System.out.println("其他信息暂不处理");
               }
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }

    }
}
