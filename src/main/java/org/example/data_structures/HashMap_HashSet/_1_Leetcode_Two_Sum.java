package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _1_Leetcode_Two_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/7/2024    NhanDinhVan    Create
 */

public class _1_Leetcode_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++)
//            map.put(nums[i], i);
//        for(int i = 0; i < nums.length; i++)
//        {
//            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i)
//                return new int[] {i , map.get(target - nums[i])};
//        }
//        return new int[] {0, 0};

//      Solution: Brute Force

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
