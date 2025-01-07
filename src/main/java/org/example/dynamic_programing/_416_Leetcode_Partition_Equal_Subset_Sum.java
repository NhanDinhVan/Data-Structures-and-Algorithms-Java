package org.example.dynamic_programing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _416_Leetcode_Partition_Equal_Subset_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/6/2025    NhanDinhVan    Create
 */

public class _416_Leetcode_Partition_Equal_Subset_Sum {
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i : nums) sum += i;

        if(sum % 2 != 0) return false;

        sum /= 2;

        memo = new Boolean[nums.length + 1][sum+1];

        return backtracking(sum, nums, 0);
    }

    public boolean backtracking(int target, int[] nums, int start){
        if (target == 0) return true;
        if (target < 0 || start >= nums.length) return false;

        if(memo[start][target] != null){
            return memo[start][target];
        }

        memo[start][target] = backtracking(target - nums[start], nums, start + 1)
                || backtracking(target, nums, start + 1);

        return memo[start][target];
    }
}
