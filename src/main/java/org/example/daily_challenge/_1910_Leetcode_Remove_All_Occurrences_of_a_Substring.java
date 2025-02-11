package org.example.daily_challenge;

/**
 * _1910_Leetcode_Remove_All_Occurrences_of_a_Substring
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/11/2025    NhanDinhVan    Create
 */

public class _1910_Leetcode_Remove_All_Occurrences_of_a_Substring {
    public static String removeOccurrences(String s, String part) {
        int partLength = part.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i <= sb.length() - partLength; i++){
            boolean match = true;

            for(int j = 0; j < partLength; j++){
                if(sb.charAt(i + j) != part.charAt(j)){
                    match = false;
                    break;
                }
            }

            if(match){
                sb.delete(i, i + partLength);
                i = -1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        removeOccurrences(s, part);
    }
}
