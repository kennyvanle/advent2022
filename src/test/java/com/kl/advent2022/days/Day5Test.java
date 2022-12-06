package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day5Test {

    @Test
    public void part1Test(){
        String input = "    [D]    \n" +
                "[N] [C]    \n" +
                "[Z] [M] [P]\n" +
                " 1   2   3 \n" +
                "\n" +
                "move 1 from 2 to 1\n" +
                "move 3 from 1 to 3\n" +
                "move 2 from 2 to 1\n" +
                "move 1 from 1 to 2";
        Assert.assertEquals("CMZ", Day5.findTops(input));
    }

    @Test
    public void part2Test(){
        String input = "    [D]    \n" +
                "[N] [C]    \n" +
                "[Z] [M] [P]\n" +
                " 1   2   3 \n" +
                "\n" +
                "move 1 from 2 to 1\n" +
                "move 3 from 1 to 3\n" +
                "move 2 from 2 to 1\n" +
                "move 1 from 1 to 2";
        Assert.assertEquals("MCD", Day5.findTops9001(input));
    }
}
