package com.codecool.kristofpanna;

import com.codecool.kristofpanna.employees.Helper;
import com.codecool.kristofpanna.employees.cooks.AbstractCookBase;
import com.codecool.kristofpanna.employees.cooks.Chef;
import com.codecool.kristofpanna.employees.cooks.Cook;
import com.codecool.kristofpanna.ingredients.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private Chef chef; // (TODO do we need it?)
    private List<AbstractCookBase> cooks = new ArrayList<>();
    private List<Helper> helpers = new ArrayList<>();

    public Kitchen(int numberOfCooks, int numberOfHelpers) { // TODO pass HiringTeam (originally created with parameters for the number of each employees)
        // TODO HiringTeam has specialized managers to hire different kinds of employees (they can have database of potential employee Persons)
        hireCooks(numberOfCooks);
        hireHelpers(numberOfHelpers);
        hireChef();
    }

    // TODO generalize and delegate to HR -> abstract HiringManager? (~employee factory) -> hire(person, salary) (?)
    private void hireCooks(int numberOfCooks) {
        for (int i = 0; i < numberOfCooks; i++) {
            cooks.add(new Cook()); // TODO parametrize (person, salary)
        }
        System.out.println("Cooks hired: " + cooks);
    }

    private void hireHelpers(int numberOfHelpers) {
        for (int i = 0; i < numberOfHelpers; i++) {
            helpers.add(new Helper()); // TODO parametrize (person, salary)
        }
        System.out.println("Helpers hired: " + helpers);
    }

    private void hireChef() {
        this.chef = new Chef(this::askForIngredient);
        cooks.add(this.chef);
        System.out.println("Our chef: " + this.chef);
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
