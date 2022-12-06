package com.kl.advent2022.days;

import java.util.*;

public class Day5 {
    public static String findTops(String input) {
        String stacks = input.split("\n\n")[0];
        String moves = input.split("\n\n")[1];
        String[] rows = stacks.split("\n");
        List<Deque<Character>> dqList = new ArrayList<>();
        for(int i = 0; i < rows.length; i++){
            dqList.add(new LinkedList<>());
        }
        for(String row: rows){
            for(int i = 0; i <= row.length()/4; i++){
                if(Character.isLetter(row.charAt(i*4 + 1))){
                    dqList.get(i).addFirst(row.charAt(i*4 + 1));
                }
            }
        }
        List<int[]> instructions = readInstructions(moves);
        for(int[] move: instructions){
            for(int i = 0; i < move[0]; i++){
                Character c = dqList.get(move[1]-1).pollLast();
                dqList.get(move[2]-1).addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Deque<Character> q : dqList){
            if(null != q.peekLast()){
                sb.append(q.pollLast());
            }
        }
        return sb.toString();
    }

    private static List<int[]> readInstructions(String moves){
        List<int[]> res = new ArrayList<>();
        String[] instructions = moves.split("\n");
        for(String s: instructions){
            int[] row = new int[3];
            String[] parts = s.split(" ");
            row[0] = Integer.parseInt(parts[1]);
            row[1] = Integer.parseInt(parts[3]);
            row[2] = Integer.parseInt(parts[5]);
            res.add(row);
        }
        return res;
    }

    public static String findTops9001(String input) {
        String stacks = input.split("\n\n")[0];
        String moves = input.split("\n\n")[1];
        String[] rows = stacks.split("\n");
        List<Deque<Character>> dqList = new ArrayList<>();
        for(int i = 0; i < rows.length; i++){
            dqList.add(new LinkedList<>());
        }
        for(String row: rows){
            for(int i = 0; i <= row.length()/4; i++){
                if(Character.isLetter(row.charAt(i*4 + 1))){
                    dqList.get(i).addFirst(row.charAt(i*4 + 1));
                }
            }
        }
        List<int[]> instructions = readInstructions(moves);
        for(int[] move: instructions){
            Stack<Character> temp = new Stack<>();
            for(int i = 0; i < move[0]; i++){
                Character c = dqList.get(move[1]-1).pollLast();
                temp.push(c);
            }
            while(!temp.isEmpty()){
                dqList.get(move[2]-1).addLast(temp.pop());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Deque<Character> q : dqList){
            if(null != q.peekLast()){
                sb.append(q.pollLast());
            }
        }
        return sb.toString();
    }
}
