package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _2352_Leetcode_Equal_Row_and_Column_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/28/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/28/2024    NhanDinhVan    Create
 */

public class _2352_Leetcode_Equal_Row_and_Column_Pairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                col.add(grid[j][i]);
            }
            if (map.containsKey(col)) {
                ans += map.get(col);
            }
        }

        return ans;
    }
}
