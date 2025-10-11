package com.throws_;

public class CustomException {
    public static void main(String[] args) {
        int age = 123;
        if(!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄必须在18 ~ 120之间");
        }
        System.out.println("你的年龄是正常的！");
    }
}
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}