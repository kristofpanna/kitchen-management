package com.codecool.kristofpanna.employees;

import java.util.Date;

public abstract class Employee {
    protected String name;
    protected Date birthDate;
    protected int salary;

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void createTaxReport() {
        int taxPercent = 99;
        System.out.println("Tax: " + salary * taxPercent / 100);
    }

}
