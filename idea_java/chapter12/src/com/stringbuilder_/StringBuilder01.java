package com.stringbuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {

//        继承了 AbstractStringBuilder 类
//        实现了Serializable 接口，说明其对象可以进行串行化(该对象可以网络传输和保存到文件)
//        是final类，不能被继承
//        字符序列仍然存放在父类AbstractStringBuilder的byte value[]中(堆)
//        StringBuilder 的方法，没有做互斥处理，没有synchronized 关键字，因此在单线程的情况下使用
//        StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
    }
}
