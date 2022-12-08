package com.kl.advent2022.days.day7;

public class DepthFirstSearch {
    public static int addBelowThreshold(Directory directory, int threshold) {
        int sum = 0;
        int dirSize = directory.getSize();
        if (dirSize <= threshold) {
            sum += dirSize;
        }

        for (Directory d : directory.getNodes()) {
            sum += addBelowThreshold(d, threshold);
        }

        return sum;
    }
}
