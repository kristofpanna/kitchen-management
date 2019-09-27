package com.codecool.kristofpanna.employees;

import com.codecool.kristofpanna.ingredients.IngredientType;
import com.codecool.kristofpanna.util.Randomize;

import java.util.HashMap;

public class Helper extends Employee {
    /**
     * Amount of ingredients with the helper by ingredient type.
     */
    private HashMap<IngredientType, Integer> ingredients = new HashMap<>();

    public Helper() {
        initIngredients();
    }

    private void initIngredients() {
        int maxAmount = 3;
        for (IngredientType ingredientType : IngredientType.values()) {
            ingredients.put(ingredientType, Randomize.getRandInt(maxAmount));
        }
    }
}
