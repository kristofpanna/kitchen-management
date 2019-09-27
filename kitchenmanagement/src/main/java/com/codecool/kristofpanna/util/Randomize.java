package com.codecool.kristofpanna.util;

import java.util.Random;

public class Randomize {
    private static final Random random = new Random();

    /**
     * Get a random integer between 1 and the given number.
     * @param to max possible value, inclusive
     */
    public static int getRandInt(int to) {
        return random.nextInt(to + 1);
    }

    /**
     * Get random event with the given probability.
     * @param probabilityPercent probability of true in percent
     * @return if a random event happened or not
     */
    public static boolean isRandomEvent(int probabilityPercent) {
        return random.nextInt(100) < probabilityPercent;
    }



}