package org.example.binary_search;

/**
 * _1351_Leetcode_Count_Negative_Numbers_in_a_Sorted_Matrix
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

public class _1351_Leetcode_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] < 0) count++;
            }
        }

        return count;
    }
}
