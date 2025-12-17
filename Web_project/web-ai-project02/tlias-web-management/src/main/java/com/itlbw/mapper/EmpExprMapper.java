package com.itlbw.mapper;


import com.itlbw.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工工作经历
 */
@Mapper
public interface EmpExprMapper {

    void insertBatch(List<EmpExpr> exprList);
}
