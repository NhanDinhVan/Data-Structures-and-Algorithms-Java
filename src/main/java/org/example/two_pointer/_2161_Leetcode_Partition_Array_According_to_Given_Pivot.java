package org.example.two_pointer;

/**
 * _2161_Leetcode_Partition_Array_According_to_Given_Pivot
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _2161_Leetcode_Partition_Array_According_to_Given_Pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] newNums = new int[nums.length];
        int i = 0;

        for(int n : nums){
            if(n < pivot) newNums[i++] = n;
        }
        for(int n : nums){
            if(n == pivot) newNums[i++] = n;
        }
        for(int n : nums){
            if(n > pivot) newNums[i++] = n;
        }
        return newNums;
    }
}
