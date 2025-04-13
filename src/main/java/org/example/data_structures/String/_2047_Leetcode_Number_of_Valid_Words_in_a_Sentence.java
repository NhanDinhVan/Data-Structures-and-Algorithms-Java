package org.example.data_structures.String;

/**
 * _2047_Leetcode_Number_of_Valid_Words_in_a_Sentence
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/13/2025    NhanDinhVan    Create
 */

public class _2047_Leetcode_Number_of_Valid_Words_in_a_Sentence {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.trim().split("\\s+");
        int ans = 0;

        for(String token : tokens){
            if(token.isEmpty()) continue;
            if(check(token)) ans++;
        }

        return ans;
    }

    public static boolean check(String token){
        int l = token.length();
        int h = 0;

        for(int i = 0; i < l; i++){
            char c = token.charAt(i);

            if(Character.isDigit(c)) return false;

            if(c == '-'){
                h++;
                if(h > 1) return false;
                if(i == 0 || i == l-1) return false;
                if(!Character.isLetter(token.charAt(i - 1)) || !Character.isLetter(token.charAt(i + 1))) return false;
            }

            if(c == '!' || c == ',' || c == '.'){
                if(i != l - 1) return false;
            }
        }

        return true;
    }
}
