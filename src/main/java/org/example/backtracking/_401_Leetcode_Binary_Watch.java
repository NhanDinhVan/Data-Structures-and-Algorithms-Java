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
//    public static int countBit(int num){
//        int count = 0;
//        while(num != 0){
//            if((num & 1) == 1){
//                count++;
//            }
//            num = num >> 1;
//        }
//        return count;
//    }
//    public List<String> readBinaryWatch(int turnedOn) {
//        List<String> results = new ArrayList<>();
//        for(int h = 0; h < 12; h++){
//            for(int m = 0; m < 60; m++){
//                int totalBits = countBit(h) + countBit(m);
//                if(totalBits == turnedOn){
//                    String time = String.format("%d:%02d", h, m);
//                    results.add(time);
//                }
//            }
//        }
//        return results;
//    }
    int[] hours = {1, 2, 4, 8};
    int[] minutes = {1, 2, 4, 8, 16, 32};
    public List<String> readBinaryWatch(int turnedOn){
        List<String> results = new ArrayList<>();
        backtrack(results, 0, 0, turnedOn, 0);
        return results;
    }
    public void backtrack(List<String> results, int h, int m, int turnedOn,int start){
        if(turnedOn == 0){
            String time = String.format("%d:%02d", h, m);
            results.add(time);
            return;
        }
        for(int i = start; i < hours.length + minutes.length; i++){
            if(i < hours.length){
                h += hours[i];
                if(h < 12){
                    backtrack(results, h, m, turnedOn - 1, i+1);
                }
                h-= hours[i];
            }else{
                m += minutes[i - hours.length];
                if(m < 60){
                    backtrack(results, h, m, turnedOn-1, i+1);
                }
                m -= minutes[i - hours.length];
            }
        }
    }
}
