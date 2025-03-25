package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _997_Leetcode_Find_the_Town_Judge
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/26/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/26/2025    NhanDinhVan    Create
 */

public class _997_Leetcode_Find_the_Town_Judge {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n==1) return 1;
        HashMap<Integer, Integer> bi = new HashMap<>();
        HashSet<Integer> ai = new HashSet<>();

        for(int[] tr : trust){
            bi.put(tr[1], bi.getOrDefault(tr[1], 0)+1);
            ai.add(tr[0]);
        }

        for(int i = 1; i <= n; i++){
            if(!ai.contains(i) && bi.getOrDefault(i, -1) == n - 1) return i;
        }

        return -1;
    }
}
