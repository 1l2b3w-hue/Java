package com.itlbw.controller;


import com.itlbw.pojo.Clazz;
import com.itlbw.pojo.Result;
import com.itlbw.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/clazzs")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    /**
     * 完成添加班级的功能
     */
    @PostMapping()
    public Result add(@RequestBody Clazz clazz) {
        log.info("添加班级..." + clazz);

        clazzService.add(clazz);

        return Result.success();

    }

    /**
     * 查询班级功能
     */

    @GetMapping("/{id}")
    public Result findAll(@PathVariable Integer id) {

        Clazz clazz = clazzService.getClazzById(id);
        return Result.success(clazz);
    }

    /**
     * 查询所有班级信息
     */
    @GetMapping()
    public Result findAll() {
        Clazz[] clazzs = clazzService.findAll();

        return Result.success(clazzs);
    }
}
