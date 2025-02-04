package org.example.daily_challenge;

/**
 * _1800_Leetcode_Maximum_Ascending_Subarray_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/4/2025    NhanDinhVan    Create
 */

public class _1800_Leetcode_Maximum_Ascending_Subarray_Sum {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int curSum = 0;

        for(int i = 0; i < nums.length - 1; i++){
            curSum += nums[i];
            if(nums[i] >= nums[i+1]){
                max = Math.max(max, curSum);
                curSum = 0;
                continue;
            }
        }

        return Math.max(max, curSum + nums[nums.length-1]);
    }
}
