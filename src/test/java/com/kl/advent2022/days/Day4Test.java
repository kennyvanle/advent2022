package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day4Test {

    @Test
    public void testPart1(){
        String input = "2-4,6-8\n" +
                "2-3,4-5\n" +
                "5-7,7-9\n" +
                "2-8,3-7\n" +
                "6-6,4-6\n" +
                "2-6,4-8";
        Assert.assertEquals(2, Day4.calcFullyContains(input));
    }

    @Test
    public void testPart2(){
        String input = "2-4,6-8\n" +
                "2-3,4-5\n" +
                "5-7,7-9\n" +
                "2-8,3-7\n" +
                "6-6,4-6\n" +
                "2-6,4-8";
        Assert.assertEquals(4, Day4.calcAnyOverlap(input));
    }
}
