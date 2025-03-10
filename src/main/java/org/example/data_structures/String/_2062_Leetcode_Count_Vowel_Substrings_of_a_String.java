package org.example.data_structures.String;

import java.util.HashMap;

/**
 * _2062_Leetcode_Count_Vowel_Substrings_of_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/10/2025    NhanDinhVan    Create
 */

public class _2062_Leetcode_Count_Vowel_Substrings_of_a_String {
    public int countVowelSubstrings(String word) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            map.clear();
            for(int j = i; j < word.length(); j++){
                if(!isVowel(word.charAt(j))) break;
                char c = word.charAt(j);
                map.put(c, map.getOrDefault(c, 0)+1);
                if(map.size() == 5) ans++;
            }
        }

        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
