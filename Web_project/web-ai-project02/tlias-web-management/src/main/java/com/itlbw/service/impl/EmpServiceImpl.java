package com.itlbw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itlbw.mapper.EmpMapper;
import com.itlbw.pojo.Emp;
import com.itlbw.pojo.EmpQueryParam;
import com.itlbw.pojo.PageResult;
import com.itlbw.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult<Emp> page(EmpQueryParam e) {
        PageHelper.startPage(e.getPage(), e.getPageSize());
        List<Emp> rows = empMapper.list(e);
        Page<Emp> p = (Page<Emp>) rows;
        return new PageResult<Emp>(p.getTotal(), p.getResult());
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
