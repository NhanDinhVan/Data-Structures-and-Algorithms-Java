package org.example.dynamic_programing;

import java.util.HashMap;

/**
 * _55_Leetcode_Jump_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/4/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/4/2024    NhanDinhVan    Create
 */

public class _55_Leetcode_Jump_Game {
    HashMap<Integer, Boolean> memo = new HashMap<>();
    public boolean canJump(int[] nums) {
        return helper(0, nums);
    }
    public boolean helper(int i, int[] nums){
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        if(i >= nums.length - 1){
            return true;
        }

        int maxJump = Math.min(i + nums[i], nums.length - 1);
        for (int j = i + 1; j <= maxJump; j++){
            if(helper(j, nums)){
                memo.put(i, true);
                return true;
            }
        }
        memo.put(i, false);
        return false;
    }
}
