package com.codecool.kristofpanna.employees.cooks;

import com.codecool.kristofpanna.YellBroadcaster;
import com.codecool.kristofpanna.ingredients.IngredientType;
import com.codecool.kristofpanna.util.Randomize;
import com.codecool.kristofpanna.util.TimeUtil;

import java.util.HashMap;

public class Chef extends AbstractCookBase {
    private YellBroadcaster yellBroadcaster;

    /**
     * How many times she yells
     */
    private int workTime = 100;

    /**
     * Amount of ingredients with the chef by ingredient type.
     */
    private HashMap<IngredientType, Integer> ingredients = new HashMap<>();


    public Chef(YellBroadcaster yellBroadcaster) {
        super();
        this.yellBroadcaster = yellBroadcaster;
        initIngredients();
    }

    private void initIngredients() {
        for (IngredientType ingredientType : IngredientType.values()) {
            ingredients.put(ingredientType, 0);
        }
    }

    @Override
    public void cook() {
        for (int i = 0; i < workTime; i++) {
            yell();
            TimeUtil.wait(1);
        }
    }

    private void yell() {
        System.out.println("Yell!");
        if (Randomize.isRandomEvent(50)) {
            IngredientType neededIngredient = IngredientType.getRandomIngredient();
            boolean gotIngredient = yellBroadcaster.askForIngredient(neededIngredient);

            if (gotIngredient) {
                ingredients.put(neededIngredient, ingredients.get(neededIngredient) + 1);
                System.out.println(
                        "Thanks! Now I have " + ingredients.get(neededIngredient) + " of the " + neededIngredient + "."
                );
            } else {
                System.out.println("Then buy some fresh " + neededIngredient + "!");
            }
        }
    }

    @Override
    public String toString() {
        return "Chef " + super.toString();
    }
}
