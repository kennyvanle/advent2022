package com.kl.advent2022.days;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Day3 {
    public static int calculatePriorities(String input) {
        String[] strArray = input.split("\n");
        HashMap<Character, Integer> errors = new HashMap<>();
        for (String str : strArray) {
            String compartment1 = str.substring(0, str.length() / 2);
            String compartment2 = str.substring(str.length() / 2, str.length());
            HashSet<Character> errSet = findDupes(compartment1, compartment2);
            for (Character c : errSet) {
                errors.put(c, errors.getOrDefault(c, 0) + 1);
            }
        }

        return calcSum(errors);
    }

    private static int calcSum(HashMap<Character, Integer> errors) {
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : errors.entrySet()) {
            if (Character.isLowerCase(entry.getKey())) {
                sum += (entry.getKey() - 'a' + 1) * entry.getValue();
            } else {
                sum += (entry.getKey() - 'A' + 1 + 26) * entry.getValue();
            }
        }
        return sum;
    }

    private static HashSet<Character> findDupes(String compartment1, String compartment2) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> dupes = new HashSet<>();
        for (Character c : compartment1.toCharArray()) {
            set.add(c);
        }
        for (Character c : compartment2.toCharArray()) {
            if (set.contains(c)) {
                dupes.add(c);
            }
        }
        return dupes;

    }

    public static int calculateBadgePriorities(String input) {
        String[] strArray = input.split("\n");
        HashMap<Character, Integer> badges = new HashMap<>();
        for(int i = 0; i < strArray.length - 2; i += 3){
            String s1 = strArray[i];
            String s2 = strArray[i+1];
            String s3 = strArray[i+2];
            char c = findBadge(s1, s2, s3);
            badges.put(c, badges.getOrDefault(c, 0) + 1);
        }
        return calcSum(badges);
    }

    private static char findBadge(String s1, String s2, String s3) {
        HashSet<Character> letters = new HashSet<>();
        HashSet<Character> dupes = new HashSet<>();
        for(Character c: s1.toCharArray()){
            letters.add(c);
        }
        for(Character c: s2.toCharArray()){
            if(letters.contains(c)){
                dupes.add(c);
            }
        }
        for(Character c: s3.toCharArray()){
            if(dupes.contains(c)){
                return c;
            }
        }
        throw new RuntimeException("badge not found");
    }
}
