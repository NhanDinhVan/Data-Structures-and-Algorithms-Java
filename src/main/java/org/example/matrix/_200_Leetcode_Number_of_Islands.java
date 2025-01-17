package org.example.matrix;

/**
 * _200_Leetcode_Number_of_Islands
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/16/2025    NhanDinhVan    Create
 */

public class _200_Leetcode_Number_of_Islands {
    private int r;
    private int c;
    public int numIslands(char[][] grid) {
        int count = 0;
        r = grid.length;
        if(r == 0) return 0;
        c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != '1') return;

        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
