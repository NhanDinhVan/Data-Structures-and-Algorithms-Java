package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * _77_Leetcode_Combinations
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

public class _77_Leetcode_Combinations {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1, new ArrayList<>());
        return results;
    }
    public void backtrack(int n, int k, int start, List<Integer> list){
        if(list.size() == k){
            results.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <= n; i++){
            list.add(i);
            backtrack(n, k, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
