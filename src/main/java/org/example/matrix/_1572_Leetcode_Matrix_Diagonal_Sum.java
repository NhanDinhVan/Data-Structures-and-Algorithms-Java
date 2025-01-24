package org.example.matrix;

/**
 * _1572_Leetcode_Matrix_Diagonal_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/24/2025    NhanDinhVan    Create
 */

public class _1572_Leetcode_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int x = 0, y1 = 0, y2 = n-1; x < n; x++, y1++, y2--){
            sum += (mat[x][y1] + mat[x][y2]);
        }

        return (n % 2 != 0) ? (sum - mat[n/2][n/2]) : sum;
    }
}
