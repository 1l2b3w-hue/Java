package com.abstract_;

public class BBB extends Template {

    public void job() {
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num *= i;
        }

    }
}
