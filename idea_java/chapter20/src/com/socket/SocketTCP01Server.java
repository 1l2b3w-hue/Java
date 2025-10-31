package com.socket;

//服务端

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
//    思路
//        1.在本机的 9999 端口进行监听，等待连接
//        细节 ： 要求 本机的 9999 端口没有被占用！！(没有其他服务监听该端口)
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在 9999 端口监听，等待连接...");

//        ServerSocket 与 Socket ： 当每次监听到有客户端连接到服务端时，serverSocket就会生成一个socket
//        ServerSocket 可以通过 accept 方法返回多个 Socket (多个客户端连接服务器的并发)

//        2. 当没有客户端连接 9999 端口时，程序会阻塞，等待连接
//        当有客户端进行连接时，则会返回 Socket 对象，程序继续执行
        Socket socket = serverSocket.accept(); // 程序会在该位置被阻塞
        System.out.println("服务端socket = " + socket.getClass());

//        3. 通过 Socket.getInputStream 读取客户端写入到数据通道的数据 ，显示
        InputStream inputStream = socket.getInputStream(); // 当客户端没有进行写入数据到数据通路时，会导致程序等待
        byte[] buffer = new byte[1024];
        int len =0;
        while((len =inputStream.read(buffer)) != -1 ) {
            System.out.println(new String(buffer,0,len));
        }

//        4.关闭输入流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
