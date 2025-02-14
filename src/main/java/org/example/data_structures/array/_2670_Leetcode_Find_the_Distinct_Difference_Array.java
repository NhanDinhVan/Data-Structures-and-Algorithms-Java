package org.example.data_structures.array;

import java.util.HashMap;

/**
 * _2670_Leetcode_Find_the_Distinct_Difference_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/14/2025    NhanDinhVan    Create
 */

public class _2670_Leetcode_Find_the_Distinct_Difference_Array {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            suffix.put(nums[i], suffix.getOrDefault(nums[i], 0)+1);
        }

        for(int i = 0; i < nums.length; i++){
            prefix.put(nums[i], prefix.getOrDefault(nums[i], 0)+1);
            suffix.put(nums[i], suffix.get(nums[i])-1);
            if(suffix.get(nums[i]) == 0) suffix.remove(nums[i]);
            nums[i] = prefix.size() - suffix.size();
        }
        return nums;
    }
}
