package com.Innerclassexercise;

public class Exercise06 {
    public static void main(String[] args) {
        String[] strs = {"dsaff","adsfafd","dafaga"};
//        String[] strs2 = DataProcessor.process(strs, DataProcessor.getFilter());
        String[] strs2 = DataProcessor.process(strs,new DataProcessor.StringFilter());
        for(String s : strs2) {
            System.out.println(s);
        }
    }
}
class DataProcessor {
//    ?定义嵌套接口 ，这是啥啊
    interface Filter {
        boolean accept(String data);
    }
    static class StringFilter implements Filter {
        public boolean accept(String data) {
            if(data.length() > 5) {
                return true;
            }
            return false;
        }
    }
    public static String[] process(String[] strs,Filter filter) {
        if(strs == null || strs.length == 0) {
            System.out.println("Empty array");
            return null;
        }
        int count = 0;
        for(String s : strs) {
            if(filter.accept(s)) {
                count++;
            }
        }
        String[] strs2 = new String[count];
        int i = 0;
        for(String s : strs) {
            if(filter.accept(s)) {
                strs2[i++] = s;
            }
        }
        return strs2;
    }
//    public static String[] process(String[] data,Filter filter) {
//        String[] str = new String[1];
//        int i = 0;
//        for(String s : data) {
//            if(!filter.accept(s)) {
//                continue;
//            }
//            str[i] = s;
//            str = addStrings(str);
//            i++;
//        }
//        if(str[str.length-1] == null) {
//            str = SubStrings(str);
//            return str;
//        }
//        return str;
//    }
//    public static String[] addStrings(String[] data) {
//        String[] s = new String[data.length + 1];
//        for(int i = 0; i < data.length; i++) {
//            s[i] = data[i];
//        }
//        return s;
//    }
//    public static String[] SubStrings(String[] data) {
//        String[] s = new String[data.length - 1];
//        for(int i = 0; i < s.length; i++) {
//            s[i] = data[i];
//        }
//        return s;
//    }
    public static StringFilter getFilter() {
        return new StringFilter();
    }

}