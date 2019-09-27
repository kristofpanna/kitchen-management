package com.codecool.kristofpanna;

import com.codecool.kristofpanna.employees.Helper;
import com.codecool.kristofpanna.employees.cooks.AbstractCookBase;
import com.codecool.kristofpanna.employees.cooks.Chef;
import com.codecool.kristofpanna.employees.cooks.Cook;
import com.codecool.kristofpanna.ingredients.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements YellBroadcaster {
    public Chef chef; // (TODO do we need it?)
    public List<AbstractCookBase> cooks = new ArrayList<>();
    public List<Helper> helpers = new ArrayList<>();

    public Kitchen() { // TODO pass ChiefHiringManager (originally created with parameters for the number of each employees)
        // TODO HiringTeam has specialized managers to hire different kinds of employees (they can have database of potential employee Persons)
        hireCooks(5);
        hireHelpers(10);
        hireChef();
    }

    // TODO generalize and delegate to HR -> abstract HiringManager (~employee factory) -> hire(person, salary) instead of constructor call
    public void hireCooks(int numberOfCooks) {
        for (int i = 0; i < numberOfCooks; i++) {
            cooks.add(new Cook()); // TODO parametrize (person, salary)
        }
        System.out.println("Cooks hired: " + cooks);
    }

    public void hireHelpers(int numberOfHelpers) {
        for (int i = 0; i < numberOfHelpers; i++) {
            helpers.add(new Helper()); // TODO parametrize (person, salary)
        }
        System.out.println("Helpers hired: " + helpers);
    }

    private void hireChef() {
        this.chef = new Chef(this);
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
    @Override
    public boolean askForIngredient(IngredientType ingredientType) {
        System.out.println("Chef's asking for " + ingredientType);
        return false;
    }
}
