package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _47_Leetcode_Permutations_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/7/2024    NhanDinhVan    Create
 */

public class _47_Leetcode_Permutations_II {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(new boolean[nums.length], nums, new ArrayList<>());
        return ans;
    }

    public void backtrack(boolean[] used, int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] || (i>0 && nums[i] == nums[i-1] && !used[i - 1]))
                continue;
            list.add(nums[i]);
            used[i] = true;
            backtrack(used, nums, list);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
