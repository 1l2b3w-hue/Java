package com.qqcommon;

import java.io.Serializable;

/**
 *  表示一个客户端与服务端进行通信时的消息
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sender; // 发送方
    private String receiver; // 接受方
    private String content; // 消息内容
    private String sendTime; // 发送时间
    private String msgType; // 发送消息类型 (可以在接口中来定义消息的类型)

    //进行扩展 ： 文件相关的成员
    private byte[] fileBytes;
    private int fileLength;
    private String dest; // 文件传输到何处
    private String src; // 文件的来源



    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public int getFileLength() {
        return fileLength;
    }

    public void setFileLength(int fileLength) {
        this.fileLength = fileLength;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }




    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
