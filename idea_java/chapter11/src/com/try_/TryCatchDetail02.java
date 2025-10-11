package com.try_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
//        当try代码块中可能又多个异常，则可以使用多个catch来分别捕获不同的异常，并进行相应处理
//        但要求子类异常写在前，父类异常在后
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName()); // NullpointerException
            int n1 =10;
            int n2 = 0;
            int res = n1 / n2;
            System.out.println(res); //ArithmeticException
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Person {
    private String name = "Jack";

    public String getName() {
        return name;
    }
}
