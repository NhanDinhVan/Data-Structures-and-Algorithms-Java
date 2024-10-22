package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

/**
 * _697_Leetcode_Degree_of_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/22/2024    NhanDinhVan    Create
 */

public class _697_Leetcode_Degree_of_an_Array {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> fre = new HashMap<>();

        int maxFre = 0;
        int minLength = nums.length;

        for(int i = 0; i < nums.length; i++){
            firstIndex.putIfAbsent(nums[i],i);

            fre.put(nums[i], fre.getOrDefault(nums[i], 0) + 1);

            if(fre.get(nums[i]) > maxFre){
                maxFre = fre.get(nums[i]);
                minLength = i - firstIndex.get(nums[i])+1;
            }else if (fre.get(nums[i]) == maxFre){
                minLength = Math.min(minLength, i - firstIndex.get(nums[i]) + 1);
            }
        }
        return minLength;
    }
}
