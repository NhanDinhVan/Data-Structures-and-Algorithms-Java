package org.example.data_structures.array;

import java.util.Arrays;
import java.util.Map;

/**
 * _453_Leetcode_Minimum_Moves_to_Equal_Array_Elements
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/1/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/1/2024    NhanDinhVan    Create
 */

public class _453_Leetcode_Minimum_Moves_to_Equal_Array_Elements {
    public int minMoves(int[] nums) {
//        O(n logn)
//
//        int count = 0;
//        Arrays.sort(nums);
//        for(int i : nums){
//            count += (-1 * (nums[0] - i));
//        }
//        return count;
//
//        O(n)
        if (nums.length == 0) return 0;
        int min = nums[0];
        int ans = 0;
        for(int i : nums)
            min = Math.min(min, i);
        for(int i : nums)
            ans += (i - min);
        return ans;
    }
}
