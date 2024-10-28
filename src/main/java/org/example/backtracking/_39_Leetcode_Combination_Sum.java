package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * _39_Leetcode_Combination_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/28/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/28/2024    NhanDinhVan    Create
 */

public class _39_Leetcode_Combination_Sum {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(target, candidates, 0, new ArrayList<>(), 0);
        return results;
    }

    public void backtrack(int target, int[] candidates, int sum, List<Integer> list, int start){
        if(sum == target){
            results.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            if(sum + candidates[i] > target) continue;
            sum += candidates[i];
            list.add(candidates[i]);
            backtrack(target, candidates, sum, list, i);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
