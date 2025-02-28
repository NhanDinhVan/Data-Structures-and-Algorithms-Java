package org.example.data_structures.array;

/**
 * _713_Leetcode_Subarray_Product_Less_Than_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/1/2025    NhanDinhVan    Create
 */

public class _713_Leetcode_Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int ans = 0;
        int prod = 1;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            prod *= nums[right];

            while(prod >= k && left <= right){
                prod /= nums[left];
                left++;
            }

            ans += (right - left + 1);
        }

        return ans;
    }
}
