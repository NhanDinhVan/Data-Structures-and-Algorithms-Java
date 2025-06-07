package org.example.sliding_window;

/**
 * _334_Leetcode_Increasing_Triplet_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _334_Leetcode_Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i : nums){
            if(i <= first){
                first = i;
            }else if(i <= second){
                second = i;
            }else{
                return true;
            }
        }
        return false;
    }
}
