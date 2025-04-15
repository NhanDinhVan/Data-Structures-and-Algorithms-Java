package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * _594_Leetcode_Longest_Harmonious_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/15/2025    NhanDinhVan    Create
 */

public class _594_Leetcode_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(Math.abs(nums[i] - nums[i+1]) == 1){
                list.add(new int[] {nums[i], nums[i+1]});
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        map.put(nums[nums.length - 1], map.getOrDefault(nums[nums.length - 1], 0)+1);

        for(int i = 0; i < list.size(); i++){
            int[] arr = list.get(i);
            max = Math.max(max, map.get(arr[0]) + map.get(arr[1]));
        }

        return max;
    }
}
