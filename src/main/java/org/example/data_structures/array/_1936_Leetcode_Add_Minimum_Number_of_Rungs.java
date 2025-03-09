package org.example.data_structures.array;

/**
 * _1936_Leetcode_Add_Minimum_Number_of_Rungs
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/9/2025    NhanDinhVan    Create
 */

public class _1936_Leetcode_Add_Minimum_Number_of_Rungs {
    public int addRungs(int[] rungs, int dist) {
        int ans = 0, prev = 0;

        for (int rung : rungs) {
            if (rung - prev > dist) {
                ans += (rung - prev - 1) / dist;
            }
            prev = rung;
        }

        return ans;
    }
}
