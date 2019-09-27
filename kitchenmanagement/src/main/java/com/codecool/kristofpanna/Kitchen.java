package com.codecool.kristofpanna;

import com.codecool.kristofpanna.employees.Helper;
import com.codecool.kristofpanna.employees.cooks.AbstractCookBase;
import com.codecool.kristofpanna.employees.cooks.Chef;
import com.codecool.kristofpanna.employees.cooks.Cook;
import com.codecool.kristofpanna.ingredients.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<AbstractCookBase> cooks = new ArrayList<>();
    private List<Helper> helpers = new ArrayList<>();

    public Kitchen(int numberOfCooks, int numberOfHelpers) {
        hireCooks(numberOfCooks);
        hireHelpers(numberOfHelpers);
        hireChef();
    }

    private void hireCooks(int numberOfCooks) {
        for (int i = 0; i < numberOfCooks; i++) {
            cooks.add(new Cook());
        }
        System.out.println("Cooks hired: " + cooks);
    }

    private void hireHelpers(int numberOfHelpers) {
        for (int i = 0; i < numberOfHelpers; i++) {
            helpers.add(new Helper());
        }
        System.out.println("Helpers hired: " + helpers);
    }

    private void hireChef() {
        Chef chef = new Chef(this::askForIngredient);
        cooks.add(chef);
        System.out.println("Our chef: " + chef);
    }

    public void startCooking() {
        for (AbstractCookBase cookBase : cooks) {
            cookBase.cook();
        }
    }


    /**
     * Chef calls it to ask for an ingredient.
     *
     * @param ingredientType type of ingredient to ask for
     * @return if someone gave it to the chef
     */
    private boolean askForIngredient(IngredientType ingredientType) {
        System.out.println("Chef's asking for " + ingredientType);
        for (Helper helper : helpers) {
            boolean gotIngredient = helper.giveIngredient(ingredientType);
            if (gotIngredient) return true;
        }
        // if nobody could give
        for (Helper helper : helpers) {
            helper.yellOut();
        }
        return false;
    }
}
