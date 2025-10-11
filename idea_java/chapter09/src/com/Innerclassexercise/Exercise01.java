package com.Innerclassexercise;

public class Exercise01 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
//      方法获取内部类
//        Warehouse.StockOperator stockOperator = warehouse.getStockOperator();
//        通过外部类创建内部类
        Warehouse.StockOperator stockOperator = warehouse.new StockOperator();
        stockOperator.addStock(50);
        stockOperator.addStock(-10);
        System.out.println(stockOperator.checkStock());
    }
}
