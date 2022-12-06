package com.kl.advent2022.days;

import java.util.HashSet;

public class Day6 {

    public static int findFirstMarkerIndex(String input, int index) {
        int left = 0;
        HashSet<Character> letters = new HashSet<>();
        for(int right = 0; right < input.length(); right++){
            while(letters.contains(input.charAt(right))){
                letters.remove(input.charAt(left));
                left++;
            }
            letters.add(input.charAt(right));
            if(letters.size() == index){
                return right + 1;
            }
        }
        return -1;
    }
}
