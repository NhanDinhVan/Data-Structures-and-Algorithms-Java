package org.example.prefix_sum;

/**
 * _1991_Leetcode_Find_the_Middle_Index_in_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/3/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/3/2025    NhanDinhVan    Create
 */

public class _1991_Leetcode_Find_the_Middle_Index_in_Array {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i = 0; i < n - 1; i++){
            nums[i+1] += nums[i];
        }

        for(int i = 0; i < n; i++){
            if((i == 0 && nums[n-1] - nums[0] == 0) || (i == n-1 && nums[n-2] == 0))
                return i;
            if(i > 0 && (nums[i-1] == nums[n-1]-nums[i]))
                return i;
        }
        return idx;
    }
}
