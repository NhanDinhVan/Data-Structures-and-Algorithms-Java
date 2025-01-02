package org.example.counting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * _2559_leetcode_Count_Vowel_Strings_in_Ranges
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/2/2025    NhanDinhVan    Create
 */

public class _2559_leetcode_Count_Vowel_Strings_in_Ranges {
    Set<Character> vowels = new HashSet<>();
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int countPrefix = 0;
        vowels.add('a');
        vowels.add('i');
        vowels.add('o');
        vowels.add('e');
        vowels.add('u');

        for(int i = 0; i < words.length; i++){
            if(checkVowel(words[i])){
                countPrefix++;
            }
            hmap.put(i, countPrefix);
        }
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            // Include the word at start if it is a vowel string
            ans[i] = hmap.get(end) - (start == 0 ? 0 : hmap.get(start - 1));
        }
        return ans;
    }

    public boolean checkVowel(String s){
        return vowels.contains(s.charAt(0)) && vowels.contains(s.charAt(s.length()-1));
    }
}
