package com.exercise_;

import java.util.Scanner;

//输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
//要求：
//        （1）用户名长度为2或3或4
//（2）密码的长度为6，要求全是数字
//（3）邮箱中包含@和．并且@在.的前面
public class Exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名");
        String name = scanner.next();
        System.out.print("请输入密码");
        String password = scanner.next();
        System.out.print("请输入邮箱");
        String email = scanner.next();

        try {
            userRegister(name, password, email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("注册成功！");
    }
    public static void userRegister(String name,String password,String email) {
        if(!(name!=null && password!=null && email!=null) ) {
            throw new RuntimeException("参数不能为null");
        }
        if(!(name.length() >= 2 && name.length() <=4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        if(!(password.length() ==6 && isDigital(password))) {
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if(!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和．并且@在.的前面");
        }
    }
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0;i < chars.length;i++) {
            if(!(chars[i] >= '0' && chars[i] <= '9')) {
                return false;
            }
        }
        return true;
    }
//    public static void main(String[] args) {
//        User user = new User();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入用户名：");
//        user.setName(scanner.next());
//        System.out.print("请输入密码：");
//        user.setPassword(scanner.next());
//        System.out.print("请输入邮箱：");
//        user.setEmail(scanner.next());
//
//        System.out.println(user);
//    }
}
//class User {
//    private String name;
//    private String password;
//    public String email;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        if(!(name.length() >= 2 && name.length() <=4)) {
//            System.out.println("用户名长度只能为2或3或4，当前用户名异常，赋默认值：user");
//            this.name = "user";
//            return;
//        }
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        if(!(password.length() == 6)) {
//            System.out.println("密码长度错误，应为6，赋默认密码123456");
//            this.password = "123456";
//            return;
//        }
//        try {
//            int i = Integer.parseInt(password);
//        } catch (NumberFormatException e) {
//            this.password = "123456";
//            System.out.println("密码要求时全数字！！密码赋初始密码123456：");
//            return;
//        }
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        if(!(email.indexOf("@") != -1 && email.indexOf(".") != -1 && email.indexOf("@") <
//        email.indexOf("."))) {
//            System.out.println("邮箱格式错误，赋默认值：用户名@126.com");
//            this.email = getName() + "@126.com";
//            return;
//        }
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
