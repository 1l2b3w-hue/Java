package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1) {
            // 会一直等待客户端输入数据，直到客户端关闭输出流才会结束该循环
            System.out.println(new String(buf,0,readLen));
        }
        outputStream.write("Hello,client!".getBytes());
        socket.shutdownOutput();// 设置结束标志

        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
