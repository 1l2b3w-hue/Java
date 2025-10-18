package com.map_;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack",12000,19);
        Employee employee2 = new Employee("John",19000,20);
        Employee employee3 = new Employee("smith",20000,21);
        Map map = new HashMap();
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee3.getId(), employee3);

        Set set = map.keySet();
        for(Object obj : set) {
            Employee e = (Employee)map.get(obj);
            if(e.getSalary() > 18000) {
                System.out.println(obj + "-" + e);
            }
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Employee e = (Employee)map.get(next);
            if(e.getSalary() > 18000) {
                System.out.println(next + "-" + e);
            }
        }

        Collection values = map.values();
        for(Object o : values) {
            Employee e = (Employee)o;
            if(e.getSalary() > 18000) {
                System.out.println(e);
            }
        }
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()) {
            Employee e = (Employee)iterator1.next();
            if(e.getSalary() > 18000) {
                System.out.println(e);
            }
        }

        Set set1 = map.entrySet();
        for(Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            if(((Employee)entry.getValue()).getSalary() > 18000 ) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
        Iterator iterator2 = set1.iterator();
        while(iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator2.next();
            if(((Employee)entry.getValue()).getSalary() > 18000) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
}
class Employee {
    private String name;
    private int salary;
    private int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
