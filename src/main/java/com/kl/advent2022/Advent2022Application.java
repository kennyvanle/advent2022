package com.kl.advent2022;

import com.kl.advent2022.days.Day1;
import com.kl.advent2022.utils.InputParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Advent2022Application {

    public static void main(String[] args) {
        SpringApplication.run(Advent2022Application.class, args);
        day1();

    }

    private static void day1() {
        String day1Input = InputParser.getFileContent("day1Input.txt");
        int maxCals = Day1.maxCalories(day1Input);
        int max3Cals = Day1.top3Elves(day1Input);
        System.out.println("Day 1 max calories part 1: " + maxCals);
        System.out.println("Day 1 max calories part 2: " + max3Cals);
    }
}
