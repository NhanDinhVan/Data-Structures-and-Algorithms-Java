package org.example.sorting;

import javafx.util.Pair;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * _1337_Leetcode_The_K_Weakest_Rows_in_a_Matrix
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/1/2025    NhanDinhVan    Create
 */

public class _1337_Leetcode_The_K_Weakest_Rows_in_a_Matrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair<Integer, Integer>> queue  = new PriorityQueue<>((a,b) -> {
            if(a.getValue() == b.getValue())
                return a.getKey()-b.getKey();
            return a.getValue() - b.getValue();
        });
        for(int i = 0; i < mat.length; i++){
            int score = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1) score++;
            }
            queue.add(new Pair<>(i, score));
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = queue.poll().getKey();
        }
        return ans;
    }
}
