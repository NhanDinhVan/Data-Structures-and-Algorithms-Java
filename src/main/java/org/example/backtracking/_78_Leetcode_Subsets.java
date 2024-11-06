package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * _78_Leetcode_Subsets
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/6/2024    NhanDinhVan    Create
 */

public class _78_Leetcode_Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    public void backtrack(int[] nums, int start, List<Integer> list){
        if(start == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[start]);
        backtrack(nums, start + 1, list);
        list.remove(list.size() - 1);
        backtrack(nums, start + 1, list);
    }
}
