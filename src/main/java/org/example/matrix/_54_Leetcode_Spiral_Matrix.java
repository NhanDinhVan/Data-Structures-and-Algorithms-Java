package org.example.matrix;

import java.util.*;

/**
 * _54_Leetcode_Spiral_Matrix
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/26/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/26/2025    NhanDinhVan    Create
 */

public class _54_Leetcode_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> results = new ArrayList<>();

        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, left = 0, right = cols - 1, bot = rows - 1;

        while(left <= right && top <= bot){

            for(int i = left; i <= right; i++){
                results.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bot; i++){
                results.add(matrix[i][right]);
            }
            right--;

            if(top <= bot){
                for(int i = right; i >= left; i--){
                    results.add(matrix[bot][i]);
                }
                bot--;
            }

            if(left <= right){
                for(int i = bot; i >= top; i--){
                    results.add(matrix[i][left]);
                }
                left++;
            }


        }

        return results;
    }
}
