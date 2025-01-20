package org.example.matrix;

/**
 * _2133_Leetcode_Check_if_Every_Row_and_Column_Contains_All_Numbers
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

public class _2133_Leetcode_Check_if_Every_Row_and_Column_Contains_All_Numbers {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;
        boolean[][] checkRows = new boolean[m][m];
        boolean[][] checkCols = new boolean[m][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int value = matrix[i][j];
                if(checkRows[i][value - 1] || checkCols[j][value - 1]) return false;
                checkRows[i][value-1] = true;
                checkCols[j][value-1] = true;
            }
        }
        return true;
    }
}
