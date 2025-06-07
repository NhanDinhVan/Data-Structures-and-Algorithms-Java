package org.example.sliding_window;

/**
 * _209_Leetcode_Minimum_Size_Subarray_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/10/2025    NhanDinhVan    Create
 */

public class _209_Leetcode_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int curSum = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];

            while (curSum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                curSum -= nums[left];
                left++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}
