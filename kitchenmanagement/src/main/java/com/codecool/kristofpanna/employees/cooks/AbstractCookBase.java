package com.codecool.kristofpanna.employees.cooks;

import com.codecool.kristofpanna.employees.Employee;

public abstract class AbstractCookBase extends Employee {
    public boolean isKnifeSetReceived = false;

    public AbstractCookBase() {
        isKnifeSetReceived = true;
    }

    public abstract void cook();

    @Override
    public String toString() {
        return "AbstractCook " + super.toString();
    }
}
