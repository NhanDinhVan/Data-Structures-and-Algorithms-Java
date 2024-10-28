package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _40_Leetcode_Combination_Sum_I
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

public class _40_Leetcode_Combination_Sum_II {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>());
        return results;
    }

    public void dfs(int[] candidate, int target,int start, List<Integer> list){
        if(target < 0) return;
        if(target == 0){
            results.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidate.length; i++){
            if(i > start && candidate[i] == candidate[i - 1]) continue;
            list.add(candidate[i]);
            dfs(candidate, target - candidate[i], i + 1, list);
            list.remove(list.size()-1);
        }
    }
}
