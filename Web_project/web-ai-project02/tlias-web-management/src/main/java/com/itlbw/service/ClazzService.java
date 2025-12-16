package com.itlbw.service;

import com.itlbw.mapper.ClazzMapper;
import com.itlbw.pojo.Clazz;
import org.springframework.beans.factory.annotation.Autowired;

public interface ClazzService {

    /**
     * 添加班级
     * @param clazz
     */
    void add(Clazz clazz);

    /**
     * 根据id查询班级
     * @param id
     * @return
     */
    Clazz getClazzById(Integer id);

    Clazz[] findAll();
}
