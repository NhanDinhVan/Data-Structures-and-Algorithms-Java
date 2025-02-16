package org.example.matrix;

/**
 * _566_Leetcode_Reshape_the_Matrix
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

public class _566_Leetcode_Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // int[][] res = new int[r][c];
        // int p = 0;
        // int q = 0;

        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat; // Kiểm tra nếu reshape không hợp lệ

        int[][] res = new int[r][c];

        int p = 0, q = 0; // p: hàng, q: cột
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[p][q] = mat[i][j];

                q++;

                if(q == c){
                    q = 0;
                    p++;
                }
            }
        }

        return res;
    }
}
