package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;

/**
 * _2154_Leetcode_Keep_Multiplying_Found_Values_by_Two
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/2/2025    NhanDinhVan    Create
 */

public class _2154_Leetcode_Keep_Multiplying_Found_Values_by_Two {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) set.add(n);

        while(set.contains(original)){
            original *= 2;
        }

        return original;
    }
}
