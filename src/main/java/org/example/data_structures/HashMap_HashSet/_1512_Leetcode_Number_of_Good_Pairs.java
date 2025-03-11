package org.example.data_structures.HashMap_HashSet;

/**
 * _1512_Leetcode_Number_of_Good_Pairs
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

public class _1512_Leetcode_Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans = 0;

        for(int n : nums) count[n]++;

        for(int i : count){
            if(i == 0 || i == 1) continue;
            ans += (i*(i-1))/2;
        }

        return ans;
    }
}
