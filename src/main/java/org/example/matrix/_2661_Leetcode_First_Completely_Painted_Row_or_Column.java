package org.example.matrix;

import java.util.HashMap;
import java.util.Map;

/**
 * _2661_Leetcode_First_Completely_Painted_Row_or_Column
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

public class _2661_Leetcode_First_Completely_Painted_Row_or_Column {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, int[]> dict = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dict.put(mat[i][j], new int[]{i, j});
            }
        }

        for(int i = 0; i < arr.length; i++){
            int[] pos = dict.get(arr[i]);

            rowCount[pos[0]]++;
            colCount[pos[1]]++;

            if(rowCount[pos[0]] == n || colCount[pos[1]] == m) return i;
        }

        return -1;
    }
}
