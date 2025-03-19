package org.example.bit_manipulation;

/**
 * _995_Leetcode_Minimum_Number_of_K_Consecutive_Bit_Flips
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

public class _995_Leetcode_Minimum_Number_of_K_Consecutive_Bit_Flips {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int flipCount = 0;
        int[] flipMaker = new int[n+1];

        for(int i = 0; i < n; i++){
            flipCount += flipMaker[i];
            if(flipCount%2 == nums[i]){
                if(i + k > n) return -1;
                ans++;
                flipCount++;
                flipMaker[i+k] -= 1;
            }
        }
        return ans;
    }
}
