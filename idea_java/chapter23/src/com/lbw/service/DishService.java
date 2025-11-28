package com.lbw.service;

import com.lbw.dao_.DishDAO;
import com.lbw.domain_.Dish;

import java.util.List;

public class DishService {
    private DishDAO dishDAO = new DishDAO();

    public List<Dish> getDishes() {
        String sql = "select * from dish";
        return dishDAO.selectMulLine(sql, Dish.class);
    }

    // 根据 菜品id 获取 Dish 对象
    public Dish getDishById(int dishId) {
        return dishDAO.selectSingle("select * from dish where id = ?",Dish.class, dishId);
    }
}
