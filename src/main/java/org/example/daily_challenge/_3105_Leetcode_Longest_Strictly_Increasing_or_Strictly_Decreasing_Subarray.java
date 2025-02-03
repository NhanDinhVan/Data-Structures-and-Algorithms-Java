package org.example.daily_challenge;

/**
 * _3105_Leetcode_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/3/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/3/2025    NhanDinhVan    Create
 */

public class _3105_Leetcode_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;

        int inc = 1;
        int dec = 1;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec = 1;
            }else if(nums[i] < nums[i-1]){
                dec++;
                inc = 1;
            }else{
                inc = dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }

        return max;
    }
}
