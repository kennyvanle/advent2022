package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day1Test {

    @Test
    public void testPart1() {
        String input = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000";
        Assert.assertEquals(24000, Day1.maxCalories(input));
    }

    @Test
    public void testPart2() {
        String input = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000";
        Assert.assertEquals(45000, Day1.top3Elves(input));
    }
}
