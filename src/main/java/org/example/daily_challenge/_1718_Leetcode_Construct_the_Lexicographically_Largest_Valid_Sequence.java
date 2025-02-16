package org.example.daily_challenge;

/**
 * _1718_Leetcode_Construct_the_Lexicographically_Largest_Valid_Sequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/16/2025    NhanDinhVan    Create
 */

public class _1718_Leetcode_Construct_the_Lexicographically_Largest_Valid_Sequence {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[n*2-1];
        boolean[] used = new boolean[n+1];

        backtrack(res, used, 0, n);

        return res;
    }

    public static boolean backtrack(int[] res, boolean[] used, int index, int n){
        if(index == res.length) return true;
        if(res[index] != 0) return backtrack(res, used, index+1, n);

        for(int i = n; i >= 1; i--){
            if(used[i]) continue;
            if(i > 1 && (index+i >= res.length || res[index+i] != 0)) continue;

            res[index] = i;
            if(i > 1) res[index + i] = i;
            used[i] = true;

            if(backtrack(res, used, index + 1, n)) return true;

            res[index] = 0;
            if(i > 1) res[index + i] = 0;
            used[i] = false;
        }
        return false;
    }
}
