package org.example.data_structures.array;

/**
 * _766_Leetcode_Toeplitz_Matrix
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/24/2025    NhanDinhVan    Create
 */

public class _766_Leetcode_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[1].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
