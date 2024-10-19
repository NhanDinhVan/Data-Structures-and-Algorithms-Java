package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _15_Leetcode_3Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/19/2024    NhanDinhVan    Create
 */

public class _15_Leetcode_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        HashSet<List<Integer>> hset = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            int l = i + 1;
            int r = nums.length - 1;
            while(r > l){
                int sum = nums[l] + nums[r] + nums[i];
                if(sum == 0){
                    hset.add(List.of(nums[i], nums[l], nums[r]) );
                }
                if(sum < 0) l++;
                else r--;
            }
        }
        results.addAll(hset);
        return results;
    }
}
