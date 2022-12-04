package com.kl.advent2022;

import com.kl.advent2022.days.Day1;
import com.kl.advent2022.days.Day2;
import com.kl.advent2022.days.Day3;
import com.kl.advent2022.days.Day4;
import com.kl.advent2022.utils.InputParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Advent2022Application {

    public static void main(String[] args) {
        SpringApplication.run(Advent2022Application.class, args);
        day4();
    }

    private static void day1() {
        String day1Input = InputParser.getFileContent("day1Input.txt");
        int maxCals = Day1.maxCalories(day1Input);
        int max3Cals = Day1.top3Elves(day1Input);
        System.out.println("Day 1 max calories part 1: " + maxCals);
        System.out.println("Day 1 max calories part 2: " + max3Cals);
    }

    private static void day2() {
        String day2Input = InputParser.getFileContent("day2Input.txt");
        int score = Day2.calculateScore(day2Input);
        int score2 = Day2.calculateScoreSecretStrategy(day2Input);
        System.out.println("Day 2 total score part 1: " + score);
        System.out.println("Day 2 total score part 2: " + score2);
    }

    private static void day3() {
        String day3Input = InputParser.getFileContent("day3Input.txt");
        int sum = Day3.calculatePriorities(day3Input);
        int badgeSum = Day3.calculateBadgePriorities(day3Input);
        System.out.println("Day 3 total sum part 1: " + sum);
        System.out.println("Day 3 total sum part 2: " + badgeSum);
    }

    private static void day4() {
        String input = InputParser.getFileContent("day4Input.txt");
        int count = Day4.calcFullyContains(input);
        int countAnyOverlap = Day4.calcAnyOverlap(input);
        System.out.println("Day 4 total count part 1: " + count);
        System.out.println("Day 4 total count part 2: " + countAnyOverlap);
    }
}
