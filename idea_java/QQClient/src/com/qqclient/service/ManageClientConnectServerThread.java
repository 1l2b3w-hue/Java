package com.qqclient.service;

import java.util.HashMap;

/**
 * 用于管理客户端连接到服务器端的线程类
 */

public class ManageClientConnectServerThread {
//    把多个线程放入到一个 HashMap 集合中，key就是用户id ，值就是线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

//    将线程加入集合中
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId,clientConnectServerThread);
    }
//    通过 userId 来获取线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }
}
