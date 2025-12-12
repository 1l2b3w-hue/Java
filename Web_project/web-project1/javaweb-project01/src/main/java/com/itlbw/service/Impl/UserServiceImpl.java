package com.itlbw.service.Impl;

import com.itlbw.dao.UserDao;
import com.itlbw.dao.UserImpL.UserDaoImpL;
import com.itlbw.entity.User;
import com.itlbw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

//@Component // 将该类的对象交给 IOC 容器进行管理
@Service
public class UserServiceImpl implements UserService {

    @Autowired // 自动的去 IOC 容器中寻找对应的bean 对象，并将这个对象赋给 userDao
    private UserDao userDao;
    @Override
    public List<User> list() {
        // 获取数据 ： 调用 Dao 层
        List<String> lines = userDao.list();
        // 逻辑处理 ： 解析数据，封装成对象，放入集合
        List<User> collect = lines.stream().map(line -> {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String username = split[1];
            String password = split[2];
            String name = split[3];
            Integer age = Integer.parseInt(split[4]);
            LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).collect(Collectors.toList());

        return collect;
    }
}
