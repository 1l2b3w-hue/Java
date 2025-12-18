package com.itlbw.mapper;


import com.itlbw.pojo.Emp;
import com.itlbw.pojo.EmpExpr;
import com.itlbw.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工工作信息
 */
@Mapper
public interface EmpMapper {

// ---------------- 原始分页操作 --------------------
    /**
     * 查询总记录数
     */
//    Integer getTotal();

    /**
     * 分页查询员工信息
     */
//    List<Emp> getEmps(Integer start, Integer pageSize);

// ---------------- PageHelper分页操作 --------------------
//    List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

//    优化
    List<Emp> list(EmpQueryParam param);

    /**
     * 添加员工基本信息
     * @param emp
     */
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertBasic(Emp emp);

    /**
     * 根据 id 批量删除员工
     */
    void delete(List<Integer> ids);
}
