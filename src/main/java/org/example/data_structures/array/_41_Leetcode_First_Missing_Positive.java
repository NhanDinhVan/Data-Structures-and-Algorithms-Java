package org.example.data_structures.array;

import java.util.HashMap;

/**
 * _41_Leetcode_First_Missing_Positive
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/14/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/14/2024    NhanDinhVan    Create
 */

public class _41_Leetcode_First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            hmap.put(nums[i], nums[i]);
            if(nums[i] > max)
                max = nums[i];
        }
        for(int i = 1; i < max; i++){
            if(!hmap.containsKey(i))
                return i;
        }
        return max + 1;
    }
}
