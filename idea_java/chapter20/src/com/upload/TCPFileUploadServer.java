package com.upload;

import java.io.*;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

//文件上传服务端
public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在 8888 号端口进行监听");
        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 存入数据
        String destFilePath = "src//copy.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        //向客户端回复收到图片
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片！");
        bw.flush();
        socket.shutdownOutput();
        bw.close();


        bis.close();
        socket.close();
        serverSocket.close();

    }
}
