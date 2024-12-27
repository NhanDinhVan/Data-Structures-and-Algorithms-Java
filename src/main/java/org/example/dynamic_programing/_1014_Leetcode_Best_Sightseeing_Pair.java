package org.example.dynamic_programing;

/**
 * _1014_Leetcode_Best_Sightseeing_Pair
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/27/2024    NhanDinhVan    Create
 */

public class _1014_Leetcode_Best_Sightseeing_Pair {
    public int maxScoreSightseeingPair(int[] values) {
        int maxI = values[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < values.length; i++){
            max = Math.max(max, maxI + values[i] - i);
            maxI = Math.max(maxI, values[i] + i);
        }
        return max;
    }
}
