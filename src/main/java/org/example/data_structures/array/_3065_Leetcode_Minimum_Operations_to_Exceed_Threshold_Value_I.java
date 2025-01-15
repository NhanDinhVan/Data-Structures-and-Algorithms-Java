package org.example.data_structures.array;

/**
 * _3065_Leetcode_Minimum_Operations_to_Exceed_Threshold_Value_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/15/2025    NhanDinhVan    Create
 */

public class _3065_Leetcode_Minimum_Operations_to_Exceed_Threshold_Value_I {
    public int minOperations(int[] nums, int k) {
        int c = 0;
        for(int n : nums){
            if (n < k) c++;
        }
        return c;
    }
}
