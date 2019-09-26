package com.codecool.kristofpanna.employees;

public class Chef extends AbstractCookBase {
    public Chef() {
        super();
    }

    @Override
    public void cook() {
        System.out.println("Yell!");
    }
}
