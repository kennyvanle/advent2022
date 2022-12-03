package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.Test;

public class Day3Test {

    @Test
    public void testPart1(){
        String input = "vJrwpWtwJgWrhcsFMMfFFhFp\n" +
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" +
                "PmmdzqPrVvPwwTWBwg\n" +
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" +
                "ttgJtRGJQctTZtZT\n" +
                "CrZsJsPPZsGzwwsLwLmpwMDw";
        Assert.assertEquals(157, Day3.calculatePriorities(input));
    }
}
