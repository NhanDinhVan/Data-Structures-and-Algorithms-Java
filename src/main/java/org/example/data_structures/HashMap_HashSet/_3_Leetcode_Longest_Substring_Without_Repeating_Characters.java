package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * _3_Leetcode_Longest_Substring_Without_Repeating_Characters
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/9/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/9/2024    NhanDinhVan    Create
 */

public class _3_Leetcode_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1)
            return n;
        Set<Character> set = new HashSet<>();
        int max = 0;
        int l = 0;

        for(int r = 0; r < n; r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l +1);
        }
        return max;
    }
}
