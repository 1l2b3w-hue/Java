package com.abstract_;

public abstract class Template {
    public abstract void job();
    public final void calculate() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));
    }
}
