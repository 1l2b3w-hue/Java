package com.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker("王强",4500);
        Manager manager = new Manager("李平",8000,10000);
        Test test = new Test();

        test.showEmpAnnal(worker);
        test.showEmpAnnal(manager);

        test.testWork(worker);
        test.testWork(manager);

    }
}
