package org.example.prefix_sum;

/**
 * _2270_Leetcode_Number_of_Ways_to_Split_Array
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

public class _2270_Leetcode_Number_of_Ways_to_Split_Array {
    public int waysToSplitArray(int[] nums) {
        int ways = 0;
        for(int i = 0; i < nums.length - 1; i++){
            nums[i+1] += nums[i];
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[nums.length-1]-nums[i]) ways++;
        }
        return ways;
    }
}
