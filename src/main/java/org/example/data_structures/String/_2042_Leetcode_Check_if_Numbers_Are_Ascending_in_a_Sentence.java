package org.example.data_structures.String;

public class _2042_Leetcode_Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static boolean areNumbersAscending(String s) {
        if(s == null || s.length() == 0)
            return true;

        int prev = -1;
        String[] tokens = s.split(" ");

        for(String token : tokens) {
            if(Character.isDigit(token.charAt(0))) {
                int value = Integer.valueOf(token);
                if(value <= prev)
                    return false;
                prev = value;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s1));
    }
}
