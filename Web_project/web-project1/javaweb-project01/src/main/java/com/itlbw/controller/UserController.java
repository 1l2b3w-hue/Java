package com.itlbw.controller;

import cn.hutool.core.io.IoUtil;
import com.itlbw.entity.User;
import com.itlbw.service.Impl.UserServiceImpl;
import com.itlbw.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    // 属性注入
//    @Qualifier("userServiceImpl2")
//    @Autowired
//    private UserService userService;
    @Resource(name = "userServiceImpl2")
    private UserService userService;

    // 构造器注入
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }


    // setter 注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping("/list")
    public List<User> getUser() throws FileNotFoundException {

        // 调用 Service 获取数据
        List<User> list = userService.list();

        // 返回响应数据
        return list;

        /*
//        加载读取文件
//        打包后会失效，不要这样读取文件
        InputStream in = new FileInputStream("src//main//resources//user.txt");
//        推荐读取 ：
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

//        解析数据，封装成对象，放入集合
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
//         返回响应数据
        return collect;

         */


    }
}
