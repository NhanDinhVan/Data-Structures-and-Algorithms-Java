package org.example.matrix;

/**
 * _695_Leetcode_Max_Area_of_Island
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

public class _695_Leetcode_Max_Area_of_Island {
    private int maxArea = 0;
    private int r;
    private int c;
    public int maxAreaOfIsland(int[][] grid) {
        r = grid.length;
        if(r == 0) return 0;
        c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0) return 0;

        grid[i][j] = 0;

        // Explore all four directions and sum up the area
        int area = 1; // Count the current cell
        area += dfs(grid, i + 1, j); // Down
        area += dfs(grid, i - 1, j); // Up
        area += dfs(grid, i, j + 1); // Right
        area += dfs(grid, i, j - 1); // Left

        return area;
    }


}
