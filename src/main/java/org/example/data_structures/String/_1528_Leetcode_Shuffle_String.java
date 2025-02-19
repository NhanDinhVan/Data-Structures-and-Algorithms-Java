package org.example.data_structures.String;

/**
 * _1528_Leetcode_Shuffle_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/19/2025    NhanDinhVan    Create
 */

public class _1528_Leetcode_Shuffle_String {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        char[] shuffledArr = new char[indices.length];

        for(int i = 0; i < s.length(); i++){
            shuffledArr[indices[i]] = s.charAt(i);
        }

        for(char c : shuffledArr){
            ans.append(c);
        }

        return ans.toString();
    }
}
