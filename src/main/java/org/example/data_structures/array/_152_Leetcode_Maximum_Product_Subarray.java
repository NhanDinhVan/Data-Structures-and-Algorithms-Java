package org.example.data_structures.array;

/**
 * _152_Leetcode_Maximum_Product_Subarray
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

public class _152_Leetcode_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int tmp = min;
                min = max;
                max = tmp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
