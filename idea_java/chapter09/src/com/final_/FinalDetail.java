package com.final_;

public class FinalDetail {
    public static void main(String[] args) {
        DD dd = new DD();
        dd.say();
    }
}
class AA {
    public final double TAX_RATE = 0.01;
    public final double TAX_RATE1 ;
    public final double TAX_RATE3 ;

    public AA() {
        this.TAX_RATE1 = 0.02;
    }
    {
        TAX_RATE3 = 0.02;
    }

}
class BB {
    public final static double TAX_RATE = 0.01;
    public final static double TAX_RATE1 ;
//    public final static double TAX_RATE2 ;
//
//    public BB() {
//        TAX_RATE2 = 0.02;
//    }

    static {
        TAX_RATE1 = 0.02;
    };
}
class CC {
    public final void say() {
        System.out.println("123");
    }
}
class DD extends CC {
//    public void say(){
//
//    }
}
