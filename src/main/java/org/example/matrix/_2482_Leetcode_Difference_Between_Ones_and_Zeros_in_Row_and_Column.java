package org.example.matrix;

/**
 * _2482_Leetcode_Difference_Between_Ones_and_Zeros_in_Row_and_Column
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/20/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/20/2025    NhanDinhVan    Create
 */

public class _2482_Leetcode_Difference_Between_Ones_and_Zeros_in_Row_and_Column {
    public int[][] onesMinusZeros(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int[][] rowsCal = new int[m][2];
//        int[][] colsCal = new int[n][2];
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                int value = grid[i][j];
//                rowsCal[i][value]++;
//                colsCal[j][value]++;
//            }
//        }
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                int value = rowsCal[i][1] + colsCal[j][1] - rowsCal[i][0] - colsCal[j][0];
//                grid[i][j] = value;
//            }
//        }
//        return grid;

        int m = grid.length;
        int n = grid[0].length;
        int[] rowsCal = new int[m];
        int[] colsCal = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    rowsCal[i]++;
                    colsCal[j]++;
                }

            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = rowsCal[i] + colsCal[j] - m + rowsCal[i] - n + colsCal[j];
            }
        }
        return grid;
    }
}
