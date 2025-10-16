package com.list_;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSource {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(5);
        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(int i = 11; i <= 15; i++){
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
