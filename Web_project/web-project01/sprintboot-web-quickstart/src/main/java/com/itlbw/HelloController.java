package com.itlbw;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 标识当前类为请求处理类
public class HelloController {

    @RequestMapping("/hello") // 表示请求路劲
    public String hello(String name) {
        System.out.println("name = " + name);
        return "Hello " + name + "~";
    }

}
