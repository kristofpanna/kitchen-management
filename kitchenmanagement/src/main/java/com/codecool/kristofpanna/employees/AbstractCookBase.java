package com.codecool.kristofpanna.employees;

public abstract class AbstractCookBase {
    public boolean isKnifeSetReceived = false;

    public AbstractCookBase() {
        isKnifeSetReceived = true;
    }

    public abstract void cook();
}
