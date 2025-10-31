package com.socket;

//客户端

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
//        思路
//         1.连接服务端(ip , 端口号)
//          连接成功则返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9999); //连接本机的 9999 号端口
        System.out.println("客户端 socket =" + socket.getClass());

//         2. 通过 socket.getOutputStream() 获得和 Socket 对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

//        3. 通过输出流 向数据通道写入相关数据
        outputStream.write("hello,Server".getBytes());

//        4.关闭对应的输出流和 socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出~");
    }
}
