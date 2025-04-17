package org.example.daily_challenge;

/**
 * _2176_Leetcode_Count_Equal_and_Divisible_Pairs_in_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/17/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/17/2025    NhanDinhVan    Create
 */

public class _2176_Leetcode_Count_Equal_and_Divisible_Pairs_in_an_Array {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count++;
                }
            }
        }

        return count;
    }
}
