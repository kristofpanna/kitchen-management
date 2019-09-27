package com.codecool.kristofpanna;

import com.codecool.kristofpanna.employees.cooks.Chef;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        // TODO new HiringTeam
        Kitchen kitchen = new Kitchen(chef); // TODO pass hiringTeam
        System.out.println("Hello Kitchen");
    }
}
