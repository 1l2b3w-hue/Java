package com.itlbw.controller;

import com.itlbw.pojo.Result;
import com.itlbw.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class uploadController {

    @Autowired
    AliyunOSSOperator aliyunOSSOperator;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("接受文件： + " + file.getOriginalFilename());
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
        log.info("文件 url 地址 ：" +url);
        return Result.success(url);

    }

    /**
     * 本地磁盘存储
     */
//    @PostMapping("/upload")
//    public Result upload(String name, Integer age, MultipartFile file) throws IOException {
//        log.info("上传文件：{},{},{}", name, age, file);
//
//        String fileName = file.getOriginalFilename();
//
//        // 存在覆盖的情况，使用 UUID 创建不会重复的文件名
//        String newFilename = UUID.randomUUID().toString();
//
//        // 获取文件后缀
//        String suffix = fileName.substring(fileName.lastIndexOf("."));
//        newFilename = newFilename + suffix;
//
//        file.transferTo(new File("D:/images/" + newFilename ));
//
//        return Result.success();
//    }

}
