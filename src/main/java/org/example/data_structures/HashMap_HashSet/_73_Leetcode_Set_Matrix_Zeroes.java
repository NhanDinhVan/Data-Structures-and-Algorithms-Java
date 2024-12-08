package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;

/**
 * _73_Leetcode_Set_Matrix_Zeroes
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/8/2024    NhanDinhVan    Create
 */

public class _73_Leetcode_Set_Matrix_Zeroes {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> columns = new HashSet<>();
        HashSet<Integer> rows = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    columns.add(j);
                    rows.add(i);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(columns.contains(j) || rows.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
