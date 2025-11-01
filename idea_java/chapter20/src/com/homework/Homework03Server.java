package com.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03Server {

    public static void main(String[] args) throws IOException {
//        监听
        ServerSocket serverSocket = new ServerSocket(8888);
//        等待客户端连接
        Socket socket = serverSocket.accept();
//        读取下载文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = "";
//        考虑将来客户端发送的数据较大
        while((len = inputStream.read(b)) != -1) {
            downloadFileName += new String(b, 0, len);
        }
        System.out.println("客户端希望下载的文件 " + downloadFileName);

        String resFileName = "";
        if("高山流水".equals(downloadFileName)) {
            resFileName = "src\\高山流水.mp3";
        }
        else {
            resFileName = "src\\无名.mp3";
        }

        // 创建一个输入流，读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));

        // 使用工具类读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 得到 socket 关联的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 写入到数据通道，返回客户端
        bos.write(bytes);
        socket.shutdownOutput();

        // 关闭相关资源
        bis.close();
        bos.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }

//    我的写法
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(8888);
//        Socket socket = serverSocket.accept();
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//        String s = br.readLine();
//
//        String filePath = "src//" + s;
//        System.out.println(filePath);
//        InputStream is = null;
//        OutputStream outputStream = null;
//        if(new File(filePath).exists()) {
//            is = new FileInputStream(filePath);
//            byte[] buf = StreamUtils.streamToByteArray(is);
//            outputStream = socket.getOutputStream();
//            outputStream.write(buf);
//        }
//        else {
//            filePath = "src//copy.jpg";
//            is = new FileInputStream(filePath);
//            byte[] buf = StreamUtils.streamToByteArray(is);
//            outputStream = socket.getOutputStream();
//            outputStream.write(buf);
//        }
//
//
//        outputStream.close();
//        is.close();
//        br.close();
//        socket.close();
//        serverSocket.close();
//    }
}
