package org.example.data_structures.array;

/**
 * _2206_Leetcode_Divide_Array_Into_Equal_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/2/2025    NhanDinhVan    Create
 */

public class _2206_Leetcode_Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        int[] countArr = new int[500];

        for(int i : nums){
            countArr[i]++;
        }
        for(int i : nums){
            if(countArr[i]%2==1) return false;
        }
        return true;
    }
}
