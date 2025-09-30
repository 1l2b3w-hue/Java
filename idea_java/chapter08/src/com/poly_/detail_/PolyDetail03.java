package com.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

    }
}
class AA {

}
class BB extends AA {

}
