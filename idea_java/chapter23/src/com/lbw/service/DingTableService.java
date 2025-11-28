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

//    public boolean reserveDingTable(int tableId, String name,String phone) {
//        String sql = "select state from dingtable where id = ?";
//        String o = (String)dingTableDAO.queryScalar(sql, tableId);
//        if(!(o.equals("空"))) {
//            return false;
//        }
//        sql = "update dingtable set orderName = ?,orderTel = ?,state = ? where id =?";
//        int affected = dingTableDAO.update(sql, name, phone, "已预定", tableId);
//        if(affected > 0) {
//            return true;
//        }
//        return false;
//    }
    // 根据给定 id 查找对应餐桌对象，如果为 null 则表明该餐桌不存在
    public DingTable getDingTableById(int id) {
        String sql = "select * from dingTable where id = ?";
        return dingTableDAO.selectSingle(sql,DingTable.class,id);
    }

    // 如果餐桌可以预定 ，调用方法，对餐桌状态进行更新
    public boolean orderDingTable(int id,String orderName,String orderTel) {
        String sql = "update dingTable set state = ?,orderName = ?,orderTel = ? where id = ?";
        int affected = dingTableDAO.update(sql, "已预定", orderName, orderTel, id);

        return affected > 0;

    }

    // 更新餐桌状态
    public boolean orderDingTable(int tableId,String state) {
        int update = dingTableDAO.update("update dingTable set state = ? where id = ?", state, tableId);
        return update > 0;

    }

    // 重置餐桌状态
    public boolean resetDingTable(int tableId) {
        int update = dingTableDAO.update("update dingTable set state = '空',orderName = '',orderTel = '' where id = ? ", tableId);
        return update > 0;

    }


}
