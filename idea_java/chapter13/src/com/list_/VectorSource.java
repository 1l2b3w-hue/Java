package com.list_;

import java.util.Vector;

public class VectorSource {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for(int i = 1; i <= 10; i++) {
            vector.add(i);
        }
        vector.add(11);
    }
}
