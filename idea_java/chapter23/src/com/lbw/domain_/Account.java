package com.lbw.domain_;

import java.time.LocalDateTime;

public class Account {
    private Integer id;
    private String menuId;
    private Integer dishId;
    private Integer number;
    private Double cash;
    private Integer tableId;
    private LocalDateTime billDate;
    private String state;

    public Account() {
    }

    public Account(Integer id, String menuId, Integer dishId, Integer number, Double cash, Integer tableId, LocalDateTime billDate, String state) {
        this.id = id;
        this.menuId = menuId;
        this.dishId = dishId;
        this.number = number;
        this.cash = cash;
        this.tableId = tableId;
        this.billDate = billDate;
        this.state = state;
    }

    @Override
    public String toString() {
        return id + "\t\t" + dishId + "\t\t\t" + number + "\t\t\t" + cash + "\t" + tableId + "\t\t" + billDate +
                "\t\t\t" + state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
