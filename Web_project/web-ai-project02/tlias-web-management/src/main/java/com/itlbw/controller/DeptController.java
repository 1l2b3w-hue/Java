package com.itlbw.controller;


import com.itlbw.pojo.Dept;
import com.itlbw.pojo.Result;
import com.itlbw.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.OutputStream;
import java.util.List;

@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

//    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);

//    @RequestMapping(value = "/depts",method= RequestMethod.GET)
    @GetMapping
    public Result list() {
//        System.out.println("查询全部部门数据");
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();

        return Result.success(deptList);

    }


    /**
     * 方式一： 通过使用 原生的 HttpServletRequest 对象获取请求参数
     */
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request) {
//        String idStr = request.getParameter("id");
////        int id = Integer.parseInt(idStr);
//
//        System.out.println("请求参数为 ：" + idStr);
//        return Result.success();
//    }



    /*
     方式二 ： 通过使用 Spring 提供的 @RequestParam 注解 将请求参数与形参绑定
     */
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(name = "id",required = false ) Integer deptId) {
//        System.out.println("请求参数为：" + deptId);
//
//        return Result.success();
//
//    }


    /*
        方式三 ： 当请求参数名与 方法参数名一致时，使用 @RequestParam 注解可以省略
     */
    @DeleteMapping
    public Result delete(Integer id) {
        log.info("删除部门号为 " + id + " 的部门");
        deptService.deleteById(id);
        return Result.success();
    }


    @PostMapping
    public Result add(@RequestBody Dept dept) {
//        System.out.println("新增部门名 : " + dept.getName());
        log.info("新增部门名 : " + dept.getName());
        deptService.add(dept);
        return Result.success();
    }


    @GetMapping("/{id}")
    public Result selectById(@PathVariable("id") Integer id) {
//        System.out.println("查询id为：" + id + "部门");
        log.info("查询id为：" + id + "的部门");
        Dept dept = deptService.getDeptById(id);
        return Result.success(dept);
    }
    @PutMapping
    public Result update(@RequestBody Dept dept) {
//        System.out.println("修改部门：" + dept);
        log.info("修改部门：" + dept);
        deptService.update(dept);

        return Result.success();
    }
}
