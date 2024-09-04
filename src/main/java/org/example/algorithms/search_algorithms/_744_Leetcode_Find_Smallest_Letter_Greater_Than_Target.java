package org.example.algorithms.search_algorithms;

import java.util.Arrays;

/**
 * _744_Leetcode_Find_Smallest_Letter_Greater_Than_Target
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/4/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/4/24   NhanDinhVan    Create
 */
public class _744_Leetcode_Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target)
                return letters[i];
        }
        return letters[0];
    }
}
