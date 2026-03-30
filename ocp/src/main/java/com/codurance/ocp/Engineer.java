package com.codurance.ocp;

public class Engineer extends Employee implements PayAmount{
    public Engineer(int salary) {
        super(salary);
    }

    @Override
    public int payAmount() {
        return getSalary();
    }
}