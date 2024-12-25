package org.example.data_structures.String;

/**
 * _2185_Leetcode_Counting_Words_With_a_Given_Prefix
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/25/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/25/2024    NhanDinhVan    Create
 */

public class _2185_Leetcode_Counting_Words_With_a_Given_Prefix {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length()<pref.length()) continue;
            boolean check = true;
            for(int j = 0; j < pref.length(); j++){
                if(words[i].charAt(j) != pref.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check) ans++;
        }
        return ans;
    }
}
