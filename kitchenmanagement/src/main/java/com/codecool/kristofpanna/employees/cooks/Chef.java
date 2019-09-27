package com.codecool.kristofpanna.employees.cooks;

public class Chef extends AbstractCookBase {
    public Chef() {
        super();
    }

    @Override
    public void cook() {
        System.out.println("Yell!");
    }

    @Override
    public String toString() {
        return "Chef " + super.toString();
    }
}
