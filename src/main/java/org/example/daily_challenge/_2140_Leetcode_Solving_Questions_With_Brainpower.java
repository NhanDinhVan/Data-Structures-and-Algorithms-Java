package org.example.daily_challenge;

/**
 * _2140_Leetcode_Solving_Questions_With_Brainpower
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/1/2025    NhanDinhVan    Create
 */

public class _2140_Leetcode_Solving_Questions_With_Brainpower {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];

        for(int i = n-1; i >= 0; i--){
            int point = questions[i][0];
            int brainPower = questions[i][1];
            int next = i + brainPower + 1;

            long solve = (long) point + ((next <= n) ? dp[next] : 0);
            long skip = dp[i+1];

            dp[i] = Math.max(skip, solve);
        }
        return dp[0];
    }
}
