package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _2089_Leetcode_Find_Target_Indices_After_Sorting_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/28/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/28/24   NhanDinhVan    Create
 */
public class _2089_Leetcode_Find_Target_Indices_After_Sorting_Array {
    public List<Integer> targetIndices(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == target)
//                result.add(nums[i]);
//        }
//        return result;
        int sameNuberCount = 0;
        int lessNumberCount = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                sameNuberCount++;
            if(nums[i] < target)
                lessNumberCount++;
        }
        for(int i = 0; i <sameNuberCount; i++){
            result.add(lessNumberCount+i);
        }
        return result;
    }
}
