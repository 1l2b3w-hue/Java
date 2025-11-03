package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.*;

/**
 * 该类/对象 完成文件传输服务
 */
public class FIleClientService {
    /**
     *
     * @param dest 文件传输到对方的哪个目录
     * @param src  源文件
     * @param senderId 发送方ID
     * @param receiverId 接受方ID
     */
    public void sendFileToOne(String dest, String src,String senderId,String receiverId) {
        Message message = new Message();
        message.setDest(dest);
        message.setSrc(src);
        message.setSender(senderId);
        message.setReceiver(receiverId);
        message.setMsgType(MessageType.MESSAGE_FILE_MSG);

        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[(int)new File(src).length()];
        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(bytes);
            message.setFileBytes(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // 提示信息
        System.out.println("\n" + senderId + " 给 " + receiverId + " 发送文件： " +
                src + " 到对方电脑目录的 " + dest );

        // 发送
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
