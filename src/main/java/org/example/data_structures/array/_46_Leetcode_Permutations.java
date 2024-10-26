package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _46_Leetcode_Permutations
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

public class _46_Leetcode_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backTrack(nums, results, new ArrayList<>());
        return results;
    }

    public void backTrack(int[] nums, List<List<Integer>> list, List<Integer> tmpList){
        if(tmpList.size() == nums.length){
            list.add(new ArrayList<>(tmpList));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (tmpList.contains(nums[i])) continue;
                tmpList.add(nums[i]);
                backTrack(nums, list, tmpList);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
