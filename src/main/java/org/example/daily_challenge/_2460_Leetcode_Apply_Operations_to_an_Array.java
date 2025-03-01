package org.example.daily_challenge;

/**
 * _2460_Leetcode_Apply_Operations_to_an_Array
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

public class _2460_Leetcode_Apply_Operations_to_an_Array {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int idx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                ans[idx++] = nums[i];
            }
        }

        return ans;
    }
}
