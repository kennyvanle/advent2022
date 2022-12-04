package com.kl.advent2022.days;

public class Day4 {
    public static int calcFullyContains(String input) {
        String[] pairs = input.split("\n");
        int count = 0;
        for(String pair: pairs){
            String pair1 = pair.split(",")[0];
            String pair2 = pair.split(",")[1];
            int[] pair1Sections = getSections(pair1);
            int[] pair2Sections = getSections(pair2);
            if(fullyContains(pair1Sections, pair2Sections)){
                count++;
            }
        }
        return count;
    }

    private static boolean fullyContains(int[] pair1Sections, int[] pair2Sections) {
        if((pair1Sections[0] <= pair2Sections[0] && pair1Sections[1] >= pair2Sections[1]) ||
                (pair1Sections[0] >= pair2Sections[0] && pair1Sections[1] <= pair2Sections[1])){
            return true;
        }
        return false;
    }

    private static int[] getSections(String pair) {
        String[] sections = pair.split("-");
        return new int[]{Integer.parseInt(sections[0]), Integer.parseInt(sections[1])};
    }

    public static int calcAnyOverlap(String input) {
        String[] pairs = input.split("\n");
        int count = 0;
        for(String pair: pairs){
            String pair1 = pair.split(",")[0];
            String pair2 = pair.split(",")[1];
            int[] pair1Sections = getSections(pair1);
            int[] pair2Sections = getSections(pair2);
            if(hasAnyOverlap(pair1Sections, pair2Sections)){
                count++;
            }
        }
        return count;
    }

    private static boolean hasAnyOverlap(int[] pair1Sections, int[] pair2Sections) {
        if((pair1Sections[0] <= pair2Sections[0] && pair2Sections[0] <= pair1Sections[1]) ||
                (pair1Sections[0] >= pair2Sections[0] && pair2Sections[1] >= pair1Sections[0]) ||
                (pair1Sections[1] <= pair2Sections[1] && pair2Sections[0] <= pair1Sections[1]) ||
                (pair1Sections[1] >= pair2Sections[1] && pair2Sections[0] >= pair1Sections[1])){
            return true;
        }
        return false;
    }
}