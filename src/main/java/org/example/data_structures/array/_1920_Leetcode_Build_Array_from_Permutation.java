package org.example.data_structures.array;

/**
 * _1920_Leetcode_Build_Array_from_Permutation
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/25/2025    NhanDinhVan    Create
 */

public class _1920_Leetcode_Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
