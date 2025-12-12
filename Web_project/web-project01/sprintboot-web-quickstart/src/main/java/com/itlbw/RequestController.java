package com.itlbw;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
//        获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式：" + method);
//        获取请求路径
        String allPath = request.getRequestURL().toString();
        String path = request.getRequestURI();
        System.out.println("请求url地址:" + allPath);
        System.out.println("请求uri地址:" + path);

//         获取请求协议
        String protocol = request.getProtocol();
        System.out.println("请求协议:" + protocol);

//        获取请求参数
        String name = request.getParameter("name");
        System.out.println("请求参数:" + name);

//        获取指定请求头
        String header = request.getHeader("User-Agent");
        System.out.println("User-Agent:" + header);

        return "OK";
    }


}
