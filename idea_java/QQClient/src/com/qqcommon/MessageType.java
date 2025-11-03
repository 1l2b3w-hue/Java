package com.qqcommon;

/**
 * 消息类型
 * 在接口中定义了一些常量
 * 这些常量用来表示消息的类型
 */

public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED = "1"; // 登录成功
    String MESSAGE_LOGIN_FAIL = "2"; // 登录失败
    String MESSAGE_COMM_MESSAGE = "3"; // 普通的信息包
    String MESSAGE_GET_ONLINE_FRIENDS = "4"; // 要求获取一个在线用户列表的信息
    String MESSAGE_RET_ONLINE_FRIENDS = "5"; // 返回一个在线用户列表的信息
    String MESSAGE_CLIENT_EXIT = "6"; // 表示客户端请求退出
    String MESSAGE_TO_ALL = "7"; // 表示群发消息
    String MESSAGE_FILE_MSG = "8"; // 表示文件消息

}
