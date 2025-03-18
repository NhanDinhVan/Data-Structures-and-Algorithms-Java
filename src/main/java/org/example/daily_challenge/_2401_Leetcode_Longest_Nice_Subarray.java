package org.example.daily_challenge;

/**
 * _2401_Leetcode_Longest_Nice_Subarray
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/18/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/18/2025    NhanDinhVan    Create
 */

public class _2401_Leetcode_Longest_Nice_Subarray {
    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int max = 0;
        int bitmask = 0;

        for(int r = 0; r < nums.length; r++){
            while((bitmask & nums[r]) != 0){
                bitmask ^= nums[l];
                l++;
            }

            bitmask |= nums[r];
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
