package org.example.data_structures.array;

/**
 * _2006_Leetcode_Count_Number_of_Pairs_With_Absolute_Difference_K
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

public class _2006_Leetcode_Count_Number_of_Pairs_With_Absolute_Difference_K {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k) ans++;
            }
        }

        return ans;
    }
}
