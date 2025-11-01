package com.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
//（1）编写客户端程序和服务器端程序
//（2）客户端可以输入一个音乐文件名，比如高山流水，服务端收到音乐名后，可以给
//客户端返回这个音乐文件，如果服务器没有这个文件，返回一个默认的音乐即可.
//（3）客户端收到文件后，保存到本地e：11
//        （4）提示：该程序可以使用StreamUtils.java
//就用图片代替音乐
public class Homework03Client {

    public static void main(String[] args) throws IOException {
        // 接受用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你希望下载的文件名：");
        String downloadFileName = scanner.next();

        //客户端连接服务端准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //获取与 socket 关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        socket.shutdownOutput();

        //读取服务端返回的文件
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //得到一个输出流，将bytes 写入磁盘
        String filePath = "d:\\" + downloadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(filePath));
        bos.write(bytes);

        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端下载完毕，正确退出...");

    }







//    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入你想要获取的照片名：");
//        String input = sc.nextLine() + ".jpg";
//        byte[] buf = input.getBytes();
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bw.write(input + "\r\n");
//        bw.newLine();
//        bw.flush();
//
//        InputStream inputStream = socket.getInputStream();
//
//        byte[] buf1 =new byte[1024];
//        int len = 0;
//        String read ="";
//        String filePath = "d:\\load.jpg";
//        OutputStream os = new FileOutputStream(filePath);
//
//        while((len = inputStream.read(buf1)) != -1) {
////            read = new String(buf1,0,len);
////            os.write(read.getBytes());
////            对于二进制文件，绝对不可以转换成 String 作为中间态 进行传输！！！！
//            os.write(buf1,0,len);
//        }
//
//
//
//
//        os.close();
//        inputStream.close();
//        bw.close();
//        socket.close();
//    }
}
