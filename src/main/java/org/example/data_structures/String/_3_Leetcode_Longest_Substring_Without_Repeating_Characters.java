package org.example.data_structures.String;

import java.util.HashSet;

/**
 * _3_Leetcode_Longest_Substring_Without_Repeating_Characters
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/28/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/28/2025    NhanDinhVan    Create
 */

public class _3_Leetcode_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();

        for(int r = 0; r < s.length(); r++){
            if(set.contains(s.charAt(r))){
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
