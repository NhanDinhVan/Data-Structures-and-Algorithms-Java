package org.example.dynamic_programing;

import java.util.HashMap;

/**
 * _1137_Leetcode_Nth_Tribonacci_Number
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

public class _1137_Leetcode_Nth_Tribonacci_Number {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    public int tribonacci(int n) {
        hmap.put(0,0);
        hmap.put(1,1);
        hmap.put(2,1);
        return helper(n);
    }
    public int helper(int n){
        if(hmap.containsKey(n)) return hmap.get(n);
        int r0 = helper(n - 3);
        int r1 = helper(n - 2);
        int r2 = helper(n - 1);
        hmap.put(n, r0 + r1 + r2);
        return r0 + r1 + r2;
    }
}
