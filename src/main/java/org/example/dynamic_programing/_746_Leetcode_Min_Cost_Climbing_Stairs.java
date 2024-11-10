package org.example.dynamic_programing;

import java.util.HashMap;
import java.util.Map;

/**
 * _746_Leetcode_Min_Cost_Climbing_Stairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/10/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/10/2024    NhanDinhVan    Create
 */

public class _746_Leetcode_Min_Cost_Climbing_Stairs {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        int[] tmpCost = new int[cost.length+1];
        for(int i = 0; i < cost.length; i++){
            tmpCost[i] = cost[i];
        }

        for(int i = tmpCost.length - 3; i >= 0; i--){
            tmpCost[i] += Math.min(tmpCost[i+1], tmpCost[i+2]);
        }
        return Math.min(tmpCost[0], tmpCost[1]);
    }

}
