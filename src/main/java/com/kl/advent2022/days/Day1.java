package com.kl.advent2022.days;

import java.util.HashMap;

public class Day1 {

    public static int maxCalories(String input) {
        String[] calories = input.split("\n\n");
        HashMap<Integer, Integer> elfCaloriesMap = new HashMap<>();
        int i = 0;
        for (String cals : calories) {
            String[] foodCals = cals.split("\n");
            for (String val : foodCals) {
                elfCaloriesMap.put(i, elfCaloriesMap.getOrDefault(i, 0) + Integer.parseInt(val));
            }
            i++;
        }
        int max = 0;
        for (Integer val : elfCaloriesMap.values()) {
            max = Math.max(val, max);
        }
        return max;
    }
}
