package com.qqserver.service;

import java.util.HashMap;

/**
 * 该类用于管理与客户端通信的线程
 */
public class ManageClientThreads {
    private static HashMap<String,ServerConnectClientThread> hm =  new HashMap<>();

    // 添加线程对象到 hm 集合
    public static void addClientThread(String userId,ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId,serverConnectClientThread);
    }

    // 通过userId 获取对应线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }
}
