package org.example.dynamic_programing;

import java.util.Arrays;

/**
 * _300_Leetcode_Longest_Increasing_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/10/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/10/2024    NhanDinhVan    Create
 */

public class _300_Leetcode_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n];
        int longest = 1;
        Arrays.fill(newNums, 1);

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    newNums[i] = Math.max(newNums[j] + 1, newNums[i]);
                }
            }
        }
        for(int i : newNums){
            longest = Math.max(longest, i);
        }
        return longest;
    }
}
