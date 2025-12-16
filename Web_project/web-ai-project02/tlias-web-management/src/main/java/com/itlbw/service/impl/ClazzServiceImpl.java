package com.itlbw.service.impl;

import com.itlbw.mapper.ClazzMapper;
import com.itlbw.pojo.Clazz;
import com.itlbw.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    /**
     * 添加班级
     * @param clazz
     */
    @Override
    public void add(Clazz clazz) {
        // 补全属性
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());

        // 调用 ClazzMapper 的方法完成添加
        clazzMapper.insert(clazz);

    }

    /**
     * 根据id查询班级
     * @param id
     * @return
     */
    @Override
    public Clazz getClazzById(Integer id) {

        return clazzMapper.getClazzById(id);
    }

    /**
     * 查询所有班级
     * @return
     */
    @Override
    public Clazz[] findAll() {
        return clazzMapper.findAll();
    }
}
