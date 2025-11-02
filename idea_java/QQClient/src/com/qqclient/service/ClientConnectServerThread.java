package com.qqclient.service;

import com.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 */
public class ClientConnectServerThread extends Thread{
//    该线程需要持有 一个Socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        // 因为线程需要在后台不断与服务器相邻，因此实现一个 while 死循环
        while(true) {
//            不断读取服务器端回送的消息
            try {
                System.out.println("客户端线程，等待读取从服务器端发送到消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//                如果服务器没有发送数据到客户端，则整个线程将会一直阻塞到readObject这里
                Message msg = (Message) ois.readObject();
//                后续会对 msg 进行相关处理
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }

//    方便获取 socket 对象
    public Socket getSocket() {
        return socket;
    }
}
