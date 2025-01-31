package org.example.data_structures.HashMap_HashSet;

import java.util.List;

/**
 * _953_Leetcode_Verifying_an_Alien_Dictionary
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/31/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/31/2025    NhanDinhVan    Create
 */

public class _953_Leetcode_Verifying_an_Alien_Dictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dict = new int[26];

        for(int i = 0; i < order.length(); i++){
            dict[order.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < words.length - 1; i++){
            if(!check(words[i], words[i+1], dict)) return false;
        }
        return true;
    }
    public boolean check(String w1, String w2, int[] dict){
        int len1 = w1.length();
        int len2 = w2.length();

        for (int i = 0; i < Math.min(len1, len2); i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if (c1 != c2) {
                return dict[c1 - 'a'] < dict[c2 - 'a'];
            }
        }

        return len1 <= len2;
    }
}
