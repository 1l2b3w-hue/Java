package com.lbw.service;

import com.lbw.dao_.DingTableDAO;
import com.lbw.domain_.DingTable;
import org.junit.jupiter.api.Test;

import java.util.List;

// 实现对 DingTable 表的操作的业务层，通过调用 DingTableDAO 实现
public class DingTableService {
    private DingTableDAO dingTableDAO = new DingTableDAO();


    public List<DingTable> getDingTable() {
        String sql = "select * from dingTable";
        List<DingTable> dingTables = dingTableDAO.selectMulLine(sql, DingTable.class);
        return dingTables;
    }

}
