package org.example.data_structures.String;

/**
 * _2114_Leetcode_Maximum_Number_of_Words_Found_in_Sentences
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/9/2025    NhanDinhVan    Create
 */

public class _2114_Leetcode_Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for(String s : sentences){
            max = Math.max(max, s.split(" ").length);
        }
        return max;
    }
}
