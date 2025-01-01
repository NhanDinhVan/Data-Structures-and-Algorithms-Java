package org.example.counting;

import java.util.Arrays;

/**
 * _1657_Leetcode_Determine_if_Two_Strings_Are_Close
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/1/2025    NhanDinhVan    Create
 */

public class _1657_Leetcode_Determine_if_Two_Strings_Are_Close {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int n = word1.length();
        int[] w1 = new int[26];
        int[] w2 = new int[26];

        for(int i = 0; i < n; i++){
            w1[word1.charAt(i)-'a']++;
            w2[word2.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++){
            if((w1[i] == 0 && w2[i] != 0) || (w2[i] == 0 && w1[i] != 0)) return false;
        }

        Arrays.sort(w1);
        Arrays.sort(w2);

        for(int i = 0; i < 26; i++){
            if(w1[i] != w2[i]) return false;
        }
        return true;
    }
}
