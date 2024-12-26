package org.example.backtracking;

/**
 * _494_Leetcode_Target_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/26/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/26/2024    NhanDinhVan    Create
 */

public class _494_Leetcode_Target_Sum {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtracking(nums, target, 0, 0);
        return count;
    }
    public void backtracking(int[] nums, int target, int start, int sum){
        if(start >= nums.length){
            if(sum == target) count++;
            return;
        }
        backtracking(nums, target, start+1,sum+nums[start]);
        backtracking(nums, target, start+1,sum-nums[start]);

    }
}
