package org.example.daily_challenge;

/**
 * _1863_Leetcode_Sum_of_All_Subset_XOR_Totals
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/5/2025    NhanDinhVan    Create
 */

public class _1863_Leetcode_Sum_of_All_Subset_XOR_Totals {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    public static int dfs(int[] nums, int idx, int cur){
        if(idx == nums.length) return cur;

        int a = dfs(nums, idx+1, cur);
        int b = dfs(nums, idx+1, cur^nums[idx]);

        return a+b;
    }
}
