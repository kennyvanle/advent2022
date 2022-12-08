package com.kl.advent2022.days;

import com.kl.advent2022.days.day7.DepthFirstSearch;
import com.kl.advent2022.days.day7.FileStore;

public class Day7 {

    public static int calculateSumOfDirectoriesBelowThreshold(String input, int threshold) {
        FileStore fileStore = new FileStore(input);
        fileStore.executeCommands();
        fileStore.goToRoot();
        int sum = DepthFirstSearch.addBelowThreshold(fileStore.getCurrent(), threshold);
        return sum;
    }
}
