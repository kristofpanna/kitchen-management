package com.codecool.kristofpanna;

import com.codecool.kristofpanna.employees.cooks.Chef;

public class Main {
    public static void main(String[] args) {
        // TODO new HiringTeam
        Kitchen kitchen = new Kitchen(5, 3); // TODO pass hiringTeam
        System.out.println("Hello Kitchen");
        kitchen.startCooking();
    }
}
