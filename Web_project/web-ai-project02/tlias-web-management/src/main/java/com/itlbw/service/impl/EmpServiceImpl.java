package com.itlbw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itlbw.mapper.EmpExprMapper;
import com.itlbw.mapper.EmpMapper;
import com.itlbw.pojo.*;
import com.itlbw.service.EmpLogService;
import com.itlbw.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;

    @Autowired
    private EmpLogService empLogService;

    @Override
    public PageResult<Emp> page(EmpQueryParam e) {
        PageHelper.startPage(e.getPage(), e.getPageSize());
        List<Emp> rows = empMapper.list(e);
        Page<Emp> p = (Page<Emp>) rows;
        return new PageResult<Emp>(p.getTotal(), p.getResult());
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void add(Emp emp) {
        try {
            // 补全属性
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());

            // 调用 EmpMapper 的方法完成添加员工基本信息
            empMapper.insertBasic(emp);

            // 主动抛错
//            int i = 1/0;


            // 调用 EmpExprMapper 的方法完成添加员工工作经历
            List<EmpExpr> exprList = emp.getExprList();
            // 遍历集合，为每一个 EmpExpr 对象设置员工 主键id
            exprList.forEach(expr -> {
                expr.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        } finally {
            EmpLog empLog = new EmpLog(null,LocalDateTime.now(), "新增员工信息" + emp);
            // 添加记录新增员工信息日志(无论是否添加成功)
            empLogService.insertLog(empLog);
        }
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void delete(List<Integer> ids) {
        // 批量删除员工信息
        empMapper.delete(ids);

        // 批量删除员工工作经历
        empExprMapper.delete(ids);
    }

    /**
     * 查询所有员工信息
     */
    @Override
    public List<Emp> list() {

        return empMapper.selectAll();
    }


//    @Override
//    public PageResult<Emp> page(Integer start, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end) {
//
//        PageHelper.startPage(start, pageSize);
//        List<Emp> rows = empMapper.list(name,gender,begin,end);
//
//        Page<Emp> p = (Page<Emp>) rows;
//
//        return new PageResult<Emp>(p.getTotal(), p.getResult());
//    }
}
