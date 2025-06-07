package org.example.sliding_window;

/**
 * _2760_Leetcode_Longest_Even_Odd_Subarray_With_Threshold
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/22/2024    NhanDinhVan    Create
 */

public class _2760_Leetcode_Longest_Even_Odd_Subarray_With_Threshold {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int longest = 0;
        int n = nums.length;
        for(int l = 0; l < n; l++){
            if(nums[l]%2 != 0 || nums[l] > threshold) continue;
            int count = 1;
                for (int r = l + 1; r < n; r++) {
                    if (nums[r] % 2 != nums[r-1] % 2 && nums[r] <= threshold) {
                        count++;
                    } else {
                        break;
                    }
                }
                longest = Math.max(longest, count);
            }
        return longest;
    }
    // 1    2   3   5
    // 1    4   5   8   6
    public static void main(String[] args) {

    }
}
