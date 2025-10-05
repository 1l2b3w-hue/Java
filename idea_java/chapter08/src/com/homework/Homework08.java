package com.homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(10000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(100);
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(10000);
        savingsAccount.deposit(100);//10000 + 100 = 10100
        savingsAccount.withdraw(100);//10000
        savingsAccount.deposit(100);//10100
        savingsAccount.withdraw(100);//9999
        System.out.println(savingsAccount.getBalance());
        savingsAccount.profit(); // 9999 + 99.99
        savingsAccount.deposit(100);//1099.99
        savingsAccount.withdraw(100);//9999.99
        savingsAccount.deposit(100);
        savingsAccount.withdraw(100);//10097.99
        System.out.println(savingsAccount.getBalance());

    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);//-1 :扣除手续费
        System.out.println("扣除手续费:1$");

    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);//+1 :扣除手续费
        System.out.println("扣除手续费:1$");
    }
}
class SavingsAccount extends BankAccount {
    int number = 3;
    int month = 1;
    private double rate = 0.01;
    public SavingsAccount(double balance) {
        super(balance);
    }
    public void profit() {
        System.out.println("每月利息 ：" +( getBalance() * rate));
        super.deposit(getBalance() * rate);
        System.out.println("请输入当前月份");
        int tempt = new Scanner(System.in).nextInt();
        if(tempt != month) {
            month = tempt;
            number = 3;
        }
    }
    @Override
    public void deposit(double amount) {
        if(number > 0) {
            super.deposit(amount);
            System.out.println("不扣除手续费");
            number--;
            return;
        }
            super.deposit(amount - 1);
            System.out.println("扣除手续费:1$");//-1 :扣除手续费



    }

    @Override
    public void withdraw(double amount) {
        if(number > 0) {
            super.withdraw(amount);
            System.out.println("不扣除手续费");
            number--;
            return;
        }
            super.withdraw(amount + 1);
            System.out.println("扣除手续费:1$");//+1 :扣除手续费


    }
}