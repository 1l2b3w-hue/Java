package com.lbw.domain_;

public class Dish {
    private Integer id;
    private String dishName;
    private String category;
    private Double price;

    public Dish() {
    }

    public Dish(Integer id, String dishName, String category, Double price) {
        this.id = id;
        this.dishName = dishName;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
