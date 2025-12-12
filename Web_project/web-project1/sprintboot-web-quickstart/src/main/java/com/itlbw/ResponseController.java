package com.itlbw;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {

    /**
     * 响应数据,基于 HttpServletResponse
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 1. 设置状态码
        response.setStatus(401);
        // 2. 添加响应头
        response.setHeader("name","lbw");
        // 3. 设置响应体
        response.getWriter().write("<h1>response</h1>");
    }
}
