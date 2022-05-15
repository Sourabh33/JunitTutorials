package com.example.junit4.story2;

/**
 * Employee class
 * with fields
 * name, monthlySalary and age
 */
public class Employee {
    private String name;
    private double monthlySalary;
    private int age;

    // default constructor
    public Employee() {
    }

    // constructor
    public Employee(String name, double monthlySalary, int age) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
