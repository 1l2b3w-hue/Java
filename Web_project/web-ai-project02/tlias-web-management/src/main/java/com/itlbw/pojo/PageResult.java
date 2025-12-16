package com.itlbw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 分页结果封装类
 */
@AllArgsConstructor
@Data
public class PageResult<T> {
    private Long total;
    private List<T> rows;
}
