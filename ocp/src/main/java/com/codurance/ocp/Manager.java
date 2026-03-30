package com.codurance.ocp;

public class Manager extends Employee implements PayAmount{
    private int bonus;
    public Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public int payAmount() {
        return getSalary() + bonus;
    }
}