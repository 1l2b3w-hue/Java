package com.polyparameter_;

public class Test {
    public void showEmpAnnal(Employee e) {
        e.getAnnual(); //通过动态绑定直接实现调用对应对象方法
//        if(e instanceof Worker) {
//            ((Worker)e).getAnnual();
//        }
//        else if(e instanceof Manager) {
//            ((Manager)e).getAnnual();
//        }
//        else {
//            System.out.println("信息有误，请重新检查...");
//        }
    }
    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker)e).work();
        }
        else if(e instanceof Manager) {
            ((Manager)e).manage();
        }
        else {
            System.out.println("信息有误，请重新检查...");
        }

    }
}
