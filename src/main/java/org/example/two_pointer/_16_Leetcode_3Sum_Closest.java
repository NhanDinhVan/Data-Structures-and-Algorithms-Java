package org.example.two_pointer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * _16_Leetcoed_3Sum_Closest
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/24/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/24/2024    NhanDinhVan    Create
 */

public class _16_Leetcode_3Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int curSum = nums[i] + nums[j] + nums[k];
                    if(curSum - target == 0)
                        return curSum;
                    if(Math.abs(curSum - target) < Math.abs(closestSum - target))
                        closestSum = curSum;
                }
            }
        }

        return closestSum;
    }
}
