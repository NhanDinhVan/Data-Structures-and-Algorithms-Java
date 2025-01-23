package org.example.matrix;

/**
 * _1314_Leetcode_Matrix_Block_Sum
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

public class _1314_Leetcode_Matrix_Block_Sum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] results = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int sum = 0;

                for(int p = Math.max(i - k, 0); p <= Math.min(i+k, m-1); p++){
                    for(int q = Math.max(j - k, 0); q <= Math.min(j+k, n-1); q++){
                        sum += mat[p][q];
                    }
                }

                results[i][j] = sum;
            }
        }
        return results;
    }
}
