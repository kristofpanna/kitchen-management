package com.codecool.kristofpanna.employees.cooks;

public class Cook extends AbstractCookBase {
    public Cook() {
        super();
    }

    @Override
    public void cook() {
        // cooks
        System.out.println("(OK, I'm cooking.)");
    }

    @Override
    public String toString() {
        return "Cook " + super.toString();
    }

}
