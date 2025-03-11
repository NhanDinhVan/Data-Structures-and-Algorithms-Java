package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _2001_Leetcode_Number_of_Pairs_of_Interchangeable_Rectangles
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/11/2025    NhanDinhVan    Create
 */

public class _2001_Leetcode_Number_of_Pairs_of_Interchangeable_Rectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<>();
        long ans = 0;

        for(int[] rec : rectangles){
            double b = (double) rec[0]/rec[1];
            ans += map.getOrDefault(b, 0);
            map.put(b, map.getOrDefault(b, 0)+1);
        }

        return ans;
    }
}
