package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.InetAddress;
public class SocketTCP01Client_my {
    public static void main(String[] args) throws IOException {
//        创建一个 Socket 对象，使其连接本机的9999 端口
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println(socket.getClass());

//        获取socket 的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server!".getBytes());

        outputStream.close();
        socket.close();
    }
}
