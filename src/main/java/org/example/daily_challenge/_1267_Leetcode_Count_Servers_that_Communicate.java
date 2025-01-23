package org.example.daily_challenge;

/**
 * _1267_Leetcode_Count_Servers_that_Communicate
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/23/2025    NhanDinhVan    Create
 */

public class _1267_Leetcode_Count_Servers_that_Communicate {
    public int countServers(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] itemOfRows = new int[m];
        int[] itemOfCols = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    itemOfRows[i]++;
                    itemOfCols[j]++;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && (itemOfRows[i] > 1 || itemOfCols[j] > 1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
