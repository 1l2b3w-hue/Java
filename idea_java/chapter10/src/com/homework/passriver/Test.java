package com.homework.passriver;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("唐僧",VehiclesFactory.getHorse());
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
        person.fly();

    }
}
