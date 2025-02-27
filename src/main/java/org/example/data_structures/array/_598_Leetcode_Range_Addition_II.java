package org.example.data_structures.array;

/**
 * _598_Leetcode_Range_Addition_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/27/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/27/2025    NhanDinhVan    Create
 */

public class _598_Leetcode_Range_Addition_II {
    public int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;

        for(int i = 0; i < ops.length; i++){
            row = Math.min(row, ops[i][0]);
            col = Math.min(col, ops[i][1]);
        }

        return row*col;
    }
}
