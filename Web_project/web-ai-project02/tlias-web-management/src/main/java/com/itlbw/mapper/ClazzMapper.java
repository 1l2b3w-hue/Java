package com.itlbw.mapper;


import com.itlbw.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClazzMapper {

    void insert(Clazz clazz);

    Clazz getClazzById(Integer id);

    Clazz[] findAll();
}
