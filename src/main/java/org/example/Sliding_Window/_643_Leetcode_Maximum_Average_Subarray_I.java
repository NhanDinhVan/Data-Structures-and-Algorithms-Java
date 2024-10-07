package org.example.Sliding_Window;

/**
 * _643_Leetcode_Maximum_Average_Subarray_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/7/2024    NhanDinhVan    Create
 */

public class _643_Leetcode_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double max = sum/k;
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum / k);
        }
        return max;
    }
}
