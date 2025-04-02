package org.example.daily_challenge;

/**
 * _2873_Leetcode_Maximum_Value_of_an_Ordered_Triplet_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/2/2025    NhanDinhVan    Create
 */

public class _2873_Leetcode_Maximum_Value_of_an_Ordered_Triplet_I {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;

        for(int i = 0; i < n - 2; i++){
            for(int j = i+1; j < n - 1; j++){
                for(int k = j+1; k < n; k++){
                    ans = Math.max(ans, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return ans;
    }
}
