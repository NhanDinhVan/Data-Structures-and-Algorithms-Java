package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _575_Leetcode_Distribute_Candies
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/5/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/5/2024    NhanDinhVan    Create
 */

public class _575_Leetcode_Distribute_Candies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet();
        for(int i : candyType){
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
