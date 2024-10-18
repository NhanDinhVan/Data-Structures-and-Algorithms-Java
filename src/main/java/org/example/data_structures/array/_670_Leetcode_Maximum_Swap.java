package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * _670_Leetcode_Maximum_Swap
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/18/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/18/2024    NhanDinhVan    Create
 */

public class _670_Leetcode_Maximum_Swap {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] last = new int[10];

        for(int i = 0; i < digits.length; i++){
            last[digits[i] - '0'] = i;
        }

        for(int i = 0; i < digits.length; i++){
            for(int j = 9; j > digits[i] - '0'; j--){
                if(last[j] > i){
                    char tmp = digits[last[j]];
                    digits[last[j]] = digits[i];
                    digits[i] = tmp;

                    return Integer.parseInt(new String(digits));
                }
            }
        }
        return num;
    }
}
