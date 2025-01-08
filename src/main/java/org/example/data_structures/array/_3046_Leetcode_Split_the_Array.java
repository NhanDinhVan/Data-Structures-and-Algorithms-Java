package org.example.data_structures.array;

/**
 * _3046_Leetcode_Split_the_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/8/2025    NhanDinhVan    Create
 */

public class _3046_Leetcode_Split_the_Array {
    public boolean isPossibleToSplit(int[] nums) {
        int[] countArr = new int[101];
        for(int i : nums){
            if(++countArr[i] >= 2) return false;
        }
        return true;
    }
}
