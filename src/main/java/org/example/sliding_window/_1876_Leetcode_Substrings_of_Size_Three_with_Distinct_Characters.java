package org.example.Sliding_Window;

/**
 * _1876_Leetcode_Substrings_of_Size_Three_with_Distinct_Characters
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/8/2024    NhanDinhVan    Create
 */

public class _1876_Leetcode_Substrings_of_Size_Three_with_Distinct_Characters {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3)
            return 0;
        int l = 0;
        int r = 2;
        int count = 0;
        while (r < s.length()){
            if(s.charAt(l) != s.charAt(l+1) && s.charAt(l) != s.charAt(r) && s.charAt(l+1) != s.charAt(r))
                count++;
            l++;r++;
        }
        return count;
    }
}
