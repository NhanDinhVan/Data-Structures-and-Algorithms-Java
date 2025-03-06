package org.example.daily_challenge;

import java.util.HashSet;

/**
 * _2965_Leetcode_Find_Missing_and_Repeated_Values
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/6/2025    NhanDinhVan    Create
 */

public class _2965_Leetcode_Find_Missing_and_Repeated_Values {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(set.contains(grid[i][j])) ans[0] = grid[i][j];
                set.add(grid[i][j]);
            }
        }

        for(int i = 1; i <= n*n; i++){
            if(!set.contains(i)){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
