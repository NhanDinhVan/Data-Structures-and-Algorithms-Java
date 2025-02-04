package org.example.data_structures.array;

/**
 * _821_Leetcode_Shortest_Distance_to_a_Character
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/3/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/3/2025    NhanDinhVan    Create
 */

public class _821_Leetcode_Shortest_Distance_to_a_Character {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        char[] sArr = s.toCharArray();

        for(int i = 0; i < n; i++){
            int min = n;
            for(int j = 0; j < n; j++){
                if(sArr[j] == c) min = Math.min(min, Math.abs(i - j));

            }
            ans[i] = min;
        }
        return ans;
    }
}
