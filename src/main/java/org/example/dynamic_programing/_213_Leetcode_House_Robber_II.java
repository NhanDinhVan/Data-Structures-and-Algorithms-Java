package org.example.dynamic_programing;

/**
 * _213_Leetcode_House_Robber_II
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

public class _213_Leetcode_House_Robber_II {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[n];
        dp1[1] = nums[1];
        for (int i = 2; i < n; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }
        int max1 = dp1[n - 1];

        int[] dp2 = new int[n];
        dp2[0] = nums[0];
        dp2[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; i++) {
            dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
        }
        int max2 = dp2[n - 2];

        return Math.max(max1, max2);
    }
}
