package com.exercise;

import java.util.HashMap;
import java.util.List;

//定义个泛型类DAO<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
//分别创建以下方法：
//        (1）publicvoidsave(Stringid,Tentity)：保存T类型的对象到Map成员变量中
//        (2) public T get(String id):从 map 中获取 id 对应的对象
//        (3)publicvoid update(String id,Tentity):替换map 中key为id的内容,改为entity 对象
//        (4)publicList<T>listO：返回map 中存放的所有T 对象
//        (5) public void delete(String id): 删除指定 id 对象
//定义一个User类：
//该类包含：private成员变量（int类型）id，age;（String 类型）name。韩教
//创建DAO 类的对象，分别调用其 save、get、update、list、delete 方法来操作 User 对象，
//使用Junit单元测试类进行测试
public class Exercise01 {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>(new HashMap<String, User>());
        User user1 = new User(10,20,"张三");
        User user2 = new User(11,21,"李四");
        dao.save("1",user1);
        dao.save("2",user2);
        System.out.println(dao.get("1"));
        System.out.println(dao.get("2"));
        dao.update("2",new User(11,22,"王五"));
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
        dao.delete("2");
        System.out.println(dao.get("2"));
    }
}
