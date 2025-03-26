package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * _2033_Leetcode_Minimum_Operations_to_Make_a_Uni_Value_Grid
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/26/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/26/2025    NhanDinhVan    Create
 */

public class _2033_Leetcode_Minimum_Operations_to_Make_a_Uni_Value_Grid {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        List<Integer> arr = new ArrayList<>();
        int check = grid[0][0] % x;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j]%x != check) return -1;
                arr.add(grid[i][j] / x);
            }
        }

        Collections.sort(arr);
        int median = arr.get(arr.size()/2);
        for(int i = 0; i < arr.size(); i++){
            ans+= Math.abs(arr.get(i)-median);
        }

        return ans;
    }
}
