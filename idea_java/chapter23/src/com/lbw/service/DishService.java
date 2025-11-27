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
}
