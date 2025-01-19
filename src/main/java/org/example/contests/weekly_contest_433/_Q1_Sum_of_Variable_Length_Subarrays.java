package org.example.contests.weekly_contest_433;

/**
 * _Q1_Sum_of_Variable_Length_Subarrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _Q1_Sum_of_Variable_Length_Subarrays {
    public int subarraySum(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            // Sum all elements in nums[start ... i]
            for (int j = start; j <= i; j++) {
                totalSum += nums[j];
            }
        }

        return totalSum;
    }
}
