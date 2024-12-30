package org.example.math;

/**
 * _2221_Leetcode_Find_Triangular_Sum_of_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _2221_Leetcode_Find_Triangular_Sum_of_an_Array {
    public int triangularSum(int[] nums) {
        int p = nums.length-1;
        while (p > 0){
            for(int i = 0; i < p; i++){
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            p--;
        }
        return nums[0];
    }
}
