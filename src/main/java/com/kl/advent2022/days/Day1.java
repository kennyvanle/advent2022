package com.kl.advent2022.days;

import java.util.HashMap;
import java.util.PriorityQueue;

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

    public static int top3Elves(String input) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(3, (c1, c2) -> c1 - c2);
        String[] calories = input.split("\n\n");
        for (String cals : calories) {
            String[] foodCals = cals.split("\n");
            int current = 0;
            for (String val : foodCals) {
                current += Integer.parseInt(val);
            }
            if (minHeap.size() >= 3) {
                if (current > minHeap.peek()) {
                    minHeap.add(current);
                    minHeap.poll();
                }
            } else {
                minHeap.add(current);
            }
        }
        int max = 0;
        while (!minHeap.isEmpty()) {
            max += minHeap.poll();
        }
        return max;
    }
}
