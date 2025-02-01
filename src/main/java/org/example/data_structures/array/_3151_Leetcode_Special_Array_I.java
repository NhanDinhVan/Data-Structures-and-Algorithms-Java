package org.example.data_structures.array;

/**
 * _3151_Leetcode_Special_Array_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/1/2025    NhanDinhVan    Create
 */

public class _3151_Leetcode_Special_Array_I {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if((nums[i+1] - nums[i]) % 2 == 0) return false;
        }
        return true;
    }
}
