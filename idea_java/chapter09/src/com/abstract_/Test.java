package com.abstract_;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("Jack",123,8000,10000);
        Employee employee = new CommonEmployee("smith",223,6000);
        manager.work();
        employee.work();
    }
}
