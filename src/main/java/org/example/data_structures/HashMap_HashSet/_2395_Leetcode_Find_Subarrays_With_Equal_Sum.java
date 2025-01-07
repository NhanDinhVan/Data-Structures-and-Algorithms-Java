package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _2395_Leetcode_Find_Subarrays_With_Equal_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/7/2025    NhanDinhVan    Create
 */

public class _2395_Leetcode_Find_Subarrays_With_Equal_Sum {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length - 1; i++){
            int sum = nums[i] + nums[i+1];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
