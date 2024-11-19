package org.example.greedy;

import java.util.Arrays;

/**
 * _561_Leetcode_Array_Partition
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/19/2024    NhanDinhVan    Create
 */

public class _561_Leetcode_Array_Partition {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n; i+=2){
            sum+= nums[i];
        }
        return sum;
    }
}
