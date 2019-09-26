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
        System.out.println("Tax: " + salary);
    }

}
