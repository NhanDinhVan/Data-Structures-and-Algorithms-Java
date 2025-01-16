package org.example.depth_first_search;

/**
 * _463_Leetcode_Island_Perimeter
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

public class _463_Leetcode_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1) {
                    // check top
                    if(i == 0 || (grid[i-1][j] == 0)){
                        count++;
                    }
                    // check bottom
                    if(i == grid.length - 1 || (grid[i+1][j] == 0)){
                        count++;
                    }
                    // check left
                    if(j == 0 || (grid[i][j-1] == 0)){
                        count++;
                    }
                    // check right
                    if(j == grid[i].length - 1 || (grid[i][j+1] == 0)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
