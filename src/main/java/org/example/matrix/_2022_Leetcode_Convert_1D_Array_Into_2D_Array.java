package org.example.matrix;

/**
 * _2022_Leetcode_Convert_1D_Array_Into_2D_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/16/2025    NhanDinhVan    Create
 */

public class _2022_Leetcode_Convert_1D_Array_Into_2D_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] ans = new int[m][n];
        int idx= 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = original[idx++];
            }
        }


        return ans;
    }
}
