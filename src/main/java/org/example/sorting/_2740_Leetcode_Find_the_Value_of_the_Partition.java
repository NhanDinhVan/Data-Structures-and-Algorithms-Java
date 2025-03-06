package org.example.sorting;

import java.util.Arrays;

/**
 * _2740_Leetcode_Find_the_Value_of_the_Partition
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/6/2025    NhanDinhVan    Create
 */

public class _2740_Leetcode_Find_the_Value_of_the_Partition {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int score = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            score = Math.min(score, nums[i] - nums[i - 1]);
        }

        return score;
    }

}
