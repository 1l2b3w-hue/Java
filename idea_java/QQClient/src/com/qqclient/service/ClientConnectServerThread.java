package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 */
public class ClientConnectServerThread extends Thread{
//    该线程需要持有 一个Socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        // 因为线程需要在后台不断与服务器相连，因此实现一个 while 死循环
        while(true) {
//            不断读取服务器端回送的消息
            if(socket.isClosed()) { // 提前判断，看当前 socket 是否关闭了，关闭了就不要继续执行了
                break;
            }
            try {
                System.out.println("客户端线程，等待读取从服务器端发送到消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//                如果服务器没有发送数据到客户端，则整个线程将会一直阻塞到readObject这里
                Message msg = (Message) ois.readObject();
//                后续会对 msg 进行相关处理
                //先判断信息类型，然后进行相应业务逻辑处理
                if(msg.getMsgType().equals(MessageType.MESSAGE_RET_ONLINE_FRIENDS)) {
                    // 这里做出一个规定，即服务端发送的在线用户信息列表通过 空格隔开
                    String[] split = msg.getContent().split(" ");
                    System.out.println("\n======== 在线用户信息列表 ========");
                    for(int i = 0; i < split.length; i++) {
                        System.out.println("用户 ：" + split[i]);
                    }
                }// 如果收到了消息
                else if(msg.getMsgType().equals(MessageType.MESSAGE_COMM_MESSAGE)) {
                    System.out.println("\n" + msg.getSender() + " 对你说: "
                            + msg.getContent() + " " + msg.getSendTime());
                }else if(msg.getMsgType().equals(MessageType.MESSAGE_TO_ALL)) {
                    System.out.println("\n" + msg.getSender() + " 对大家说: "
                            + msg.getContent() + " " + msg.getSendTime());
                }else if(msg.getMsgType().equals(MessageType.MESSAGE_FILE_MSG)) {
                    System.out.println("\n" + msg.getSender() + " 给你发送了文件,到你的电脑目录路径：" +
                            msg.getDest());

                    byte[] fileBytes = msg.getFileBytes();
                    FileOutputStream fileOutputStream = new FileOutputStream(msg.getDest());
                    fileOutputStream.write(fileBytes);
                    fileOutputStream.close();
                    System.out.println("\n保存文件成功");
                }
                else {
                    System.out.println("其他信息先不做处理");
                }
            }catch (EOFException e) { // 进行一个异常捕获(服务端主动关闭连接导致的一个异常)
                System.out.println("与服务器断开连接...");
                break;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }

//    方便获取 socket 对象
    public Socket getSocket() {
        return socket;
    }
}
