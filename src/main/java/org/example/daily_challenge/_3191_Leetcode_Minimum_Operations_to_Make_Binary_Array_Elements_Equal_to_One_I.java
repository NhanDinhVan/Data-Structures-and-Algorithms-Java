package org.example.daily_challenge;

/**
 * _3191_Leetcode_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/19/2025    NhanDinhVan    Create
 */

public class _3191_Leetcode_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public int minOperations(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 0){
                nums[i] = Math.abs(nums[i] - 1);
                nums[i+1] = Math.abs(nums[i+1] - 1);
                nums[i+2] = Math.abs(nums[i+2] - 1);
                ans++;
            }
        }

        for(int n : nums){
            if(n == 0) return -1;
        }

        return ans;
    }
}
