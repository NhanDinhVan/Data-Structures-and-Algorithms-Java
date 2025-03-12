package org.example.data_structures.String;

/**
 * _2063_Leetcode_Vowels_of_All_Substrings
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/11/2025    NhanDinhVan    Create
 */

public class _2063_Leetcode_Vowels_of_All_Substrings {
    public long countVowels(String word) {
        int n = word.length();
        long ans = 0;

        for(int i = 0; i < n; i++){
            if(isVowel(word.charAt(i))) ans += (long)(i + 1)*(n - i);
        }

        return ans;
    }
    public static boolean isVowel(Character c){
        return c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u';
    }
}
