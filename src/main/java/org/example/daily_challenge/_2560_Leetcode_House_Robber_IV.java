package org.example.daily_challenge;

import java.util.Arrays;

/**
 * _2560_Leetcode_House_Robber_IV
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/16/2025    NhanDinhVan    Create
 */

public class _2560_Leetcode_House_Robber_IV {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];

                if (i > 1) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 2][j - 1], nums[i - 1]));
                } else if (j == 1) {
                    dp[i][j] = nums[i - 1];
                }
            }
        }

        return dp[n][k];
    }
}
