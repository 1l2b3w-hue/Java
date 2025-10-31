package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server_my {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999); // 监听 9999 端口
        System.out.println("服务端开始监听 9999 端口");
        // 当有客户端连接时，创建 Socket 对象 (如果没有连接就阻塞)
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());

//        获取 socket 的输入流
        InputStream inputStream = socket.getInputStream();

//        开始准备读取
        byte[] buffer = new byte[1024];
        int len = 0;
        while((len = inputStream.read(buffer)) != -1) {
            System.out.println(new String(buffer,0,len));
        }

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
