package com.itlbw.service.impl;

import com.itlbw.mapper.DeptMapper;
import com.itlbw.pojo.Dept;
import com.itlbw.pojo.Result;
import com.itlbw.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteById(int id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        // 补全属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        // 调用 DeptMapper 的方法完成添加
        deptMapper.insert(dept);
    }

    @Override
    public Dept getDeptById(Integer id) {

        return deptMapper.getDeptById(id);
    }

    @Override
    public void update(Dept dept) {
        // 补全属性 ：updateTime
        dept.setUpdateTime(LocalDateTime.now());

        // 调用 DeptMapper 的方法完成修改
        deptMapper.update(dept);
    }
}
