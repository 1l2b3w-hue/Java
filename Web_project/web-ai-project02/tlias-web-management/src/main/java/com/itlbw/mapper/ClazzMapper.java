package com.itlbw.mapper;


import com.itlbw.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper {

    void insert(Clazz clazz);

    Clazz getClazzById(Integer id);

    Clazz[] findAll();

    // 查询班级数量
    int selectNumber();

    // 分页查询
    List<Clazz> list();
}
