package org.example.matrix;

/**
 * _1582_Leetcode_Special_Positions_in_a_Binary_Matrix
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

public class _1582_Leetcode_Special_Positions_in_a_Binary_Matrix {
    public int numSpecial(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        int ans = 0;

        int[] rowsCount = new int[r];
        int[] colsCount = new int[c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j] == 1){
                    rowsCount[i]++;
                    colsCount[j]++;
                }
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j] == 1 && rowsCount[i] == 1 && colsCount[j] == 1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
