package org.example.data_structures.String;

/**
 * _1974_Leetcode_Minimum_Time_to_Type_Word_Using_Special_Typewriter
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/27/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/27/2025    NhanDinhVan    Create
 */

public class _1974_Leetcode_Minimum_Time_to_Type_Word_Using_Special_Typewriter {
    public int minTimeToType(String word) {
        int ans = 0;
        char point = 'a';

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int m = 26 - Math.abs(point - c);
            int n = 26 - m;
            ans+= Math.min(m, n)+1;
            point = c;
        }

        return ans;
    }
}
