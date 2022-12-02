package com.kl.advent2022.days;

public class Day2 {
    private static int LOSE = 0;
    private static int DRAW = 3;
    private static int WIN = 6;
    private static int ROCK = 1;
    private static int PAPER = 2;
    private static int SCISSORS = 3;
    /*
    * A for Rock, B for Paper, and C for Scissors.
    * X for Rock, Y for Paper, and Z for Scissors.
    * * */
    public static int calculateScore(String input){
        String[] rounds = input.split("\n");
        int score = 0;
        for(String round: rounds){
            score += getMatchScore(round.split(" "));
        }
        return score;
    }

    private static int getMatchScore(String[] s) {
        int score = 0;
        if(s[0].equals("A") && s[1].equals("X") ||
                s[0].equals("B") && s[1].equals("Y") ||
                s[0].equals("C") && s[1].equals("Z")){
            score += DRAW;
        } else if((s[0].equals("A") && s[1].equals("Y") ||
                s[0].equals("B") && s[1].equals("Z") ||
                s[0].equals("C") && s[1].equals("X"))){
            score += WIN;
        } else{
            score += LOSE;
        }

        if(s[1].equals("X")){
            score += ROCK;
        } else if(s[1].equals("Y")){
            score += PAPER;
        } else{
            score += SCISSORS;
        }
        return score;
    }
}
