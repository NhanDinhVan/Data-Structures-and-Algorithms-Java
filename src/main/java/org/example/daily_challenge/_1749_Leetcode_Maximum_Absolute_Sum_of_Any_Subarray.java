package org.example.daily_challenge;

/**
 * _1749_Leetcode_Maximum_Absolute_Sum_of_Any_Subarray
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/26/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/26/2025    NhanDinhVan    Create
 */

public class _1749_Leetcode_Maximum_Absolute_Sum_of_Any_Subarray {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int max = 0;
        int curMin = 0;
        int curMax = 0;

        for(int num : nums){
            curMax = Math.max(0, curMax + num);
            max = Math.max(max, curMax);

            curMin = Math.min(0, curMin + num);
            min = Math.min(min, curMin);
        }

        return Math.max(Math.abs(min), Math.abs(max));
    }
}
