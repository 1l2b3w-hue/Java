package com.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setName("Jack");
        a1.setBalance(100);
        a1.setPassword("234567");
        a1.info();
        Account a2 = new Account("swit",130,"abcdef");
        a2.info();
    }
}
