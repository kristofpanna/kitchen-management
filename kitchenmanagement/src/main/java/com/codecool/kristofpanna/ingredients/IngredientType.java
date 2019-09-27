package com.codecool.kristofpanna.ingredients;

import com.codecool.kristofpanna.util.Randomize;


public enum IngredientType {
    CARROT, POTATO, MEAT;

    public static IngredientType getRandomIngredient() {
        return values()[Randomize.getRandIntFromZero(values().length)];
    }
}
