package org.example.math;

/**
 * _238_Leetcode_Product_of_Array_Except_Self
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

public class _238_Leetcode_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_product = new int[n];
        int[] right_product = new int[n];

        left_product[0] = 1;
        for(int i = 1; i < n; i++){
            left_product[i] = left_product[i-1] * nums[i-1];
        }

        right_product[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            right_product[i] = right_product[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i++){
            nums[i] = right_product[i]*left_product[i];
        }
        return nums;
    }
}
