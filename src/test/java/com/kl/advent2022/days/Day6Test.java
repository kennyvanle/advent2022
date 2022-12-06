package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day6Test {

    @Test
    public void testPart1a(){
        String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";
        Assert.assertEquals(7, Day6.findFirstMarkerIndex(input));
    }

    @Test
    public void testPart1b(){
        String input = "bvwbjplbgvbhsrlpgdmjqwftvncz";
        Assert.assertEquals(5, Day6.findFirstMarkerIndex(input));
    }

    @Test
    public void testPart1c(){
        String input = "nppdvjthqldpwncqszvftbrmjlhg";
        Assert.assertEquals(6, Day6.findFirstMarkerIndex(input));
    }

    @Test
    public void testPart1d(){
        String input = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
        Assert.assertEquals(10, Day6.findFirstMarkerIndex(input));
    }

    @Test
    public void testPart1e(){
        String input = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
        Assert.assertEquals(11, Day6.findFirstMarkerIndex(input));
    }
}
