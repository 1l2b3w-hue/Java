package com.itlbw.service;


import com.itlbw.mapper.DeptMapper;
import com.itlbw.pojo.Dept;
import com.itlbw.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeptService {


    List<Dept> findAll();

    void deleteById(int id);

    void add(Dept dept);

    Dept getDeptById(Integer id);

    void update(Dept dept);
}
