package org.example.dynamic_programing;

/**
 * _673_Leetcode_Number_of_Longest_Increasing_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/28/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/28/2025    NhanDinhVan    Create
 */

public class _673_Leetcode_Number_of_Longest_Increasing_Subsequence {
    class Solution {
        public int findNumberOfLIS(int[] nums) {
            int[] len_dp = new int[nums.length];
            int[] count_dp = new int[nums.length];
            int max = 0;

            for(int i = 0; i < nums.length; i++){
                len_dp[i] = 1;
                count_dp[i] = 1;
                for(int j = 0; j < i; j++){
                    if(nums[j] < nums[i]){
                        if(len_dp[j] + 1 > len_dp[i]){
                            len_dp[i] = len_dp[j] + 1;
                            count_dp[i] = count_dp[j];
                        }else if(len_dp[j] + 1 == len_dp[i]){
                            count_dp[i] += count_dp[j];
                        }
                    }
                }
                max = Math.max(max, len_dp[i]);
            }

            int ans = 0;
            for(int i = 0; i < nums.length; i++){
                if(len_dp[i] == max) ans += count_dp[i];
            }
            return ans;
        }
    }
}
