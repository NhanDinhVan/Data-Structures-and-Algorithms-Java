package org.example.dynamic_programing;

/**
 * _198_Leetcode_House_Robber
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/15/2025    NhanDinhVan    Create
 */

public class _198_Leetcode_House_Robber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }

        return dp[n-1];
    }
}
