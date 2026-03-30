package com.codurance.ocp;

public abstract class Employee {
    private int salary;

    Employee(int salary) {
        this.salary = salary;

    }

    public int getSalary(){
        return this.salary;
    }

    
}