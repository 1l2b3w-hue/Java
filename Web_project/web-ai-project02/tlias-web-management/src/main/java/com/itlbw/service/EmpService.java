package com.itlbw.service;

import com.itlbw.pojo.Emp;
import com.itlbw.pojo.EmpQueryParam;
import com.itlbw.pojo.PageResult;

import java.time.LocalDate;

/**
 * 员工信息服务接口,包括工作经历
 */
public interface EmpService {

    /**
     * 接受分页参数，返回分页结果
     */
//    PageResult<Emp> page(Integer start, Integer pageSize, String name, Integer gender, LocalDate begin,LocalDate end);

    // 优化 PageHelper 分页操作
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    // 新增员工
    void add(Emp emp);
}
