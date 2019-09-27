package com.codecool.kristofpanna.employees.cooks;

public abstract class AbstractCookBase {
    public boolean isKnifeSetReceived = false;

    public AbstractCookBase() {
        isKnifeSetReceived = true;
    }

    public abstract void cook();
}
