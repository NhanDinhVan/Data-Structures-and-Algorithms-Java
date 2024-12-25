package org.example.data_structures.String;

/**
 * _2255_Leetcode_Count_Prefixes_of_a_Given_String
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

public class _2255_Leetcode_Count_Prefixes_of_a_Given_String {
    public int countPrefixes(String[] words, String s) {
//        int count = 0;
//        for(int i = 0; i < words.length; i++){
//            if(s.startsWith(words[i])) count++;
//        }
//        return count;

        int ans = 0;
        for(int i = 0; i < words.length; i++){
            boolean check = true;
            if(words[i].length()>s.length()) continue;
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j)!=s.charAt(j)){
                    check=false;
                    break;
                }
            }
            if(check) ans++;
        }
        return ans;
    }
}
