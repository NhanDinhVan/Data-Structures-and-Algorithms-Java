package org.example.daily_challenge;

/**
 * _1400_Leetcode_Construct_K_Palindrome_Strings
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/11/2025    NhanDinhVan    Create
 */

public class _1400_Leetcode_Construct_K_Palindrome_Strings {
    public boolean canConstruct(String s, int k) {
        if(k > s.length()) return false;
        if(k == s.length()) return true;
        int[] freQ = new int[26];
        int count = 0;

        for(char c : s.toCharArray()){
            freQ[c - 'a']++;
        }

        for(int i : freQ){
            if(i % 2 != 0) count++;
        }

        return count <= k;
    }
}
