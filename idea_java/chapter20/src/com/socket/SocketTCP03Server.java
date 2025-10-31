package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//字符流
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器开始监听9999端口");
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line ;
        while((line = bufferedReader.readLine()) != null) {
            if(line.isEmpty()) {
                break;
            }
            System.out.println(line);
        }


        bufferedWriter.write("hello,client 字符流");
        bufferedWriter.newLine(); // 标记结束
        bufferedWriter.newLine(); // 标记结束
        bufferedWriter.flush(); // 手动刷新！！！！！！

//        socket.shutdownOutput();

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
