package org.example.math;

/**
 * _1217_Leetcode_Minimum_Cost_to_Move_Chips_to_The_Same_Position
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/6/2025    NhanDinhVan    Create
 */

public class _1217_Leetcode_Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public int minCostToMoveChips(int[] position) {
        int old = 0;
        int even = 0;

        for(int p : position){
            if(p%2 == 0){
                even++;
                continue;
            }
            old++;
        }
        return Math.min(old, even);
    }
}
