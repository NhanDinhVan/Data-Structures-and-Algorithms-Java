package org.example.two_pointer;

/**
 * _696_Leetcode_Count_Binary_Substrings
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

public class _696_Leetcode_Count_Binary_Substrings {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prev = 0;
        int cur = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                cur++;
            }else{
                ans += Math.min(cur, prev);
                prev = cur;
                cur = 1;
            }
        }
        ans += Math.min(prev, cur);
        return ans;
    }
}
