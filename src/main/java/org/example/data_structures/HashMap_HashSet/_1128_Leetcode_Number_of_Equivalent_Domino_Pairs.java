package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _1128_Leetcode_Number_of_Equivalent_Domino_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/7/2025    NhanDinhVan    Create
 */

public class _1128_Leetcode_Number_of_Equivalent_Domino_Pairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        // int ans = 0;
        // int m = dominoes.length;
        // for(int i = 0; i < m - 1; i++){
        //     for(int j = i + 1; j < m; j++){
        //         if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1])
        //         || (dominoes[i][0] ==  dominoes[j][1] && dominoes[j][0] == dominoes[i][1])) ans++;
        //     }
        // }
        // return ans;

        int ans = 0;
        int[] count = new int[dominoes.length];
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = dominoes.length - 1; i >= 0; i--){
            int a = Math.min(dominoes[i][0], dominoes[i][1]);
            int b = Math.max(dominoes[i][0], dominoes[i][1]);
            String key = a+","+b;

            ans += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        return ans;
    }
}
