package com.qqserver.service;

import com.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * 该类的一个对象用于与某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String uerId; // 指明与服务器连接的客户端

    public ServerConnectClientThread(Socket socket, String uerId) {
        this.socket = socket;
        this.uerId = uerId;
    }

    @Override
    public void run() { // 不断读取客户端发送的信息和向客户端发送信息

       while(true) {
           try {
               System.out.println("服务端和客户端"+ uerId +"保持通信，读取数据...");
               ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
               Message message = (Message) ois.readObject();
               // 后面处理 message
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }

    }
}
