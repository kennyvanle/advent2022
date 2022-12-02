package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day2Test {

    @Test
    public void testPart1(){
        String input = "A Y\n" +
                "B X\n" +
                "C Z";
        Assert.assertEquals(15, Day2.calculateScore(input));
    }
}
