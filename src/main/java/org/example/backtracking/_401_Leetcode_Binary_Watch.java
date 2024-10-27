package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _401_Leetcode_Binary_Watch
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/27/2024    NhanDinhVan    Create
 */

public class _401_Leetcode_Binary_Watch {
    public static int countBit(int num){
        int count = 0;
        while(num != 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> results = new ArrayList<>();
        for(int h = 0; h < 12; h++){
            for(int m = 0; m < 60; m++){
                int totalBits = countBit(h) + countBit(m);
                if(totalBits == turnedOn){
                    String time = String.format("%d:%02d", h, m);
                    results.add(time);
                }
            }
        }
        return results;
    }

//    public void backtrack(int[] check, int turnedOn){
//
//    }
}
