package org.example.algorithms.sort_algorithms;

import java.util.Arrays;
import java.util.HashMap;

/**
 * _506_Leetcode_Relative_Ranks
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/5/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/5/2024    NhanDinhVan    Create
 */

public class _506_Leetcode_Relative_Ranks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        HashMap<String, String> hmap = new HashMap<>();
        String[] awards = new String[] {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] ans = new String[n];

        for(int i = 0; i < n; i++){
            ans[i] = String.valueOf(score[i]);
        }

        Arrays.sort(score);

        for(int i = 0; i < n; i++){
            int rank = n - 1 - i;
            if (rank < 3) {
                hmap.put(String.valueOf(score[i]), awards[rank]);
            } else {
                hmap.put(String.valueOf(score[i]), String.valueOf(rank + 1));
            }
        }

        for(int i = 0; i < n; i++){
            ans[i] = hmap.get(ans[i]);
        }
        return ans;
    }
}
