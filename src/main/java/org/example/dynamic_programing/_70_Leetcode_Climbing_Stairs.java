package org.example.dynamic_programing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _70_Leetcode_Climbing_Stairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/19/2024    NhanDinhVan    Create
 */

public class _70_Leetcode_Climbing_Stairs {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    public int climbStairs(int n) {
        return helper(n);
    }
    public int helper(int n){
        if(hmap.containsKey(n))
            return hmap.get(n);

        if (n == 0) return 1;
        if (n == 1) return 1;

        int r1 = helper(n - 1);
        int r2 = helper(n - 2);

        hmap.put(n, r1 + r2);
        return r1 + r2;
}
