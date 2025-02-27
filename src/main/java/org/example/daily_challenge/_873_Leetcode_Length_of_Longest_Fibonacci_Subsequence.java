package org.example.daily_challenge;

import java.util.HashSet;

/**
 * _873_Leetcode_Length_of_Longest_Fibonacci_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/27/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/27/2025    NhanDinhVan    Create
 */

public class _873_Leetcode_Length_of_Longest_Fibonacci_Subsequence {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int i : arr) set.add(i);

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int len = 2;
                int pre = arr[j];
                int cur = pre + arr[i];

                while(set.contains(cur)){
                    len++;
                    int tmp = cur;
                    cur += pre;
                    pre = tmp;
                    max = Math.max(max, len);
                }
            }
        }
        return max;

    }
}
