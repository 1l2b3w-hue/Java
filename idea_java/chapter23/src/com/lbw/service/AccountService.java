package com.lbw.service;

import com.lbw.dao_.AccountDAO;
import com.lbw.dao_.MultiTableDAO;
import com.lbw.domain_.Account;
import com.lbw.domain_.Dish;
import com.lbw.domain_.MultiTable;

import java.util.List;
import java.util.UUID;

public class AccountService {
    private AccountDAO accountDAO = new AccountDAO();

    private DishService dishService = new DishService();

    private DingTableService dingTableService = new DingTableService();

    private MultiTableDAO multiTableDAO = new MultiTableDAO();

    // 生成一个账单
    // 更新对应餐桌状态为 ： 就餐中
    public boolean addAccount(int dishId,int number,int tableId) {
        String sql = "insert into account values(null,?,?,?,?,?,now(),'未支付')";
        // 生成一个 账单id
        String menuId = UUID.randomUUID().toString();
        // 获取账单金额 ： 菜品单价 * 数量 --> 引入 DishService 获取价格
        double cash = dishService.getDishById(dishId).getPrice() * number;
        int update = accountDAO.update(sql, menuId, dishId, number, cash, tableId);
        if(update <= 0) {
            return false;
        }
        // 准备更新餐桌状态 --> 引入 DingTableService 跟新
        return dingTableService.orderDingTable(tableId,"就餐中");
    }

    // 返回一个存放所有账单信息都集合
    public List<Account> getAccountList() {
        return accountDAO.selectMulLine("select * from account",Account.class);
    }

    public List<MultiTable> getMultiTableList() {
        return multiTableDAO.selectMulLine("select account.*,dishName " +
                    " from dish,account " +
                    "where dish.id = account.dishId",MultiTable.class);
    }

    // 返回指定餐桌编号是否有未结账的账单
    public boolean hasPayBill(int tableId) {
        String sql = "select count(state) from account where state = '未支付' and tableId = ?";
        Long count = (Long)accountDAO.queryScalar(sql, tableId);
        return count > 0;
    }

    // 修改支付后 dingTable 和 account 表的状态
    public boolean payBill(int tableId,String payMethod) {
        // 修改订单状态为 支付方式
        int update = accountDAO.update("update account set state = ? where tableId = ? and state = '未支付'",payMethod,tableId);
        if(update <= 0) {
            return false;
        }
        // 修改 餐桌状态，调用DingTableService 方法完成
        if(!dingTableService.resetDingTable(tableId)) {
            return false;
        }
        return true;
    }

}
