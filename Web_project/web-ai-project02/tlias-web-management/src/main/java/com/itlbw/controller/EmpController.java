package com.itlbw.controller;

import com.itlbw.pojo.Emp;
import com.itlbw.pojo.EmpQueryParam;
import com.itlbw.pojo.PageResult;
import com.itlbw.pojo.Result;
import com.itlbw.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 接受分页请求参数，响应分页结果
     */
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10")Integer pageSize,
//                       String name, Integer gender,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
////        PageResult<Emp> page1 = empService.page(pageSize * (page -1) , pageSize);
//        PageResult<Emp> page1 = empService.page(page, pageSize,name,gender,begin,end);
//        return Result.success(page1);
//    }

    @GetMapping
    public Result page(EmpQueryParam empQueryParam) {
        PageResult<Emp> page1 = empService.page(empQueryParam);
        return Result.success(page1);
    }

    /**
     * 新增员工功能
     */
    @PostMapping
    public Result add(@RequestBody Emp emp) {
        log.info("新增员工..." + emp);
        // 调用 Service 处理业务
        empService.add(emp);

        return Result.success();
    }

    /**
     * 员工删除功能 --- 集合接收
     */
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids) {
        log.info("删除员工id：" + ids);

        empService.delete(ids);

        return Result.success();
    }

    /**
     * 员工删除功能 --- 数组接收
     */
//    @DeleteMapping
//    public Result delete(Integer[] ids) {
//        log.info("删除员工id：" + Arrays.toString(ids));
//        return Result.success();
//    }


}
