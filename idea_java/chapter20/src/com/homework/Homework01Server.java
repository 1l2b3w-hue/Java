package com.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
//（1）使用字符流的方式，编写一个客户端程序和服务器端程序，
//        （2）客户端发送“name”，服务器端接收到后，返回“我是nova”，nova是你自已的名字
//3）客户端发送“hobby”，服务器端接收到后，返回“编写java程序
//（4）不是这两个问题，回复“你说啥呢”
public class Homework01Server {
    public static void main(String[] args) throws Exception {
//        监听端口号 9999
        ServerSocket serverSocket = new ServerSocket(9999);
//
        System.out.println("服务端等待数据....");
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        String msg ;
        if("name".equals(s)) {
            msg = "我是nova";
        }
        else if("hobby".equals(s)) {
            msg = "编写java程序";
        }
        else {
            msg = "你说啥呢";
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(msg + "\r\n");
        bw.newLine();
        bw.flush();

//        socket.shutdownOutput();

        br.close();
        bw.close();
        socket.close();
        serverSocket.close();

    }
}
