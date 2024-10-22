package org.example.dynamic_programing;

import java.util.HashMap;

/**
 * _560_Leetcode_Subarray_Sum_Equals_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/22/2024    NhanDinhVan    Create
 */

public class _560_Leetcode_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}
