package com.codecool.kristofpanna;

import com.codecool.kristofpanna.ingredients.IngredientType;

@FunctionalInterface
public interface YellBroadcaster {
    boolean askForIngredient(IngredientType ingredientType);
}
