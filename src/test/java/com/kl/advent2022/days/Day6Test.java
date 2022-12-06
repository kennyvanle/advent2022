package com.kl.advent2022.days;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Day6Test {

    @Test
    public void testPart1a() {
        String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";
        Assert.assertEquals(7, Day6.findFirstMarkerIndex(input, 4));
    }

    @Test
    public void testPart1b() {
        String input = "bvwbjplbgvbhsrlpgdmjqwftvncz";
        Assert.assertEquals(5, Day6.findFirstMarkerIndex(input, 4));
    }

    @Test
    public void testPart1c() {
        String input = "nppdvjthqldpwncqszvftbrmjlhg";
        Assert.assertEquals(6, Day6.findFirstMarkerIndex(input, 4));
    }

    @Test
    public void testPart1d() {
        String input = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
        Assert.assertEquals(10, Day6.findFirstMarkerIndex(input, 4));
    }

    @Test
    public void testPart1e() {
        String input = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
        Assert.assertEquals(11, Day6.findFirstMarkerIndex(input, 4));
    }

    @Test
    public void testPart2a() {
        String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";
        Assert.assertEquals(19, Day6.findFirstMarkerIndex(input, 14));
    }

    @Test
    public void testPart2b() {
        String input = "bvwbjplbgvbhsrlpgdmjqwftvncz";
        Assert.assertEquals(23, Day6.findFirstMarkerIndex(input, 14));
    }

    @Test
    public void testPart2c() {
        String input = "nppdvjthqldpwncqszvftbrmjlhg";
        Assert.assertEquals(23, Day6.findFirstMarkerIndex(input, 14));
    }

    @Test
    public void testPart2d() {
        String input = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
        Assert.assertEquals(29, Day6.findFirstMarkerIndex(input, 14));
    }

    @Test
    public void testPart2e() {
        String input = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
        Assert.assertEquals(26, Day6.findFirstMarkerIndex(input, 14));
    }
}
