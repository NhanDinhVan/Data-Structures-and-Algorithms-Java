package org.example.data_structures.String;

/**
 * _1967_Leetcode_Number_of_Strings_That_Appear_as_Substrings_in_Word
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/27/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/27/2025    NhanDinhVan    Create
 */

public class _1967_Leetcode_Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}
