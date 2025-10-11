package com.Innerclassexercise;

public class Warehouse {
    private static int totalStock = 0;

    class StockOperator {
        public void addStock(int num) {
            if(num < 0) {
                System.out.println("新增数量无效");
                return;
            }
            totalStock += num;
        }
        public int checkStock() {
            return totalStock;
        }
    }
    public StockOperator getStockOperator() {
        return new StockOperator();
    }
}
