package org.example.matrix;

/**
 * _2017_Leetcode_Grid_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/21/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/21/2025    NhanDinhVan    Create
 */

public class _2017_Leetcode_Grid_Game {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long[] rowTopSum = new long[n];
        long[] rowBotSum = new long[n];

        rowTopSum[0] = grid[0][0];
        for(int i = 1; i < n; i++){
            rowTopSum[i] = rowTopSum[i-1] + grid[0][i];
        }

        rowBotSum[0] = grid[1][0];
        for(int i = 1; i < n; i++){
            rowBotSum[i] = rowBotSum[i-1] + grid[1][i];
        }

        long result = Long.MAX_VALUE;

        for(int i = 0; i < n; i++){
            long topRemaining = (i == n-1) ? 0 : rowTopSum[n-1] - rowTopSum[i];

            long botRemaining = (i == 0) ? 0 : rowBotSum[i-1];

            long robot2Point = Math.max(topRemaining, botRemaining);

            result = Math.min(result, robot2Point);
        }

        return result;
    }
}
