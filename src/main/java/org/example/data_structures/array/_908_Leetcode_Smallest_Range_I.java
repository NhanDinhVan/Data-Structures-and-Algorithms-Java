package org.example.data_structures.array;

/**
 * _908_Leetcode_Smallest_Range_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/18/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/18/2025    NhanDinhVan    Create
 */

public class _908_Leetcode_Smallest_Range_I {
    public int smallestRangeI(int[] nums, int k) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        return Math.max(0, (maxNum - minNum - 2 * k));
    }
}
