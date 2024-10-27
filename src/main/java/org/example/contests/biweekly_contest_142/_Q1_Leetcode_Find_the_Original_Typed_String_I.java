package org.example.contests.biweekly_contest_142;

import java.util.HashMap;

/**
 * _Q1_Leetcode_Find_the_Original_Typed_String_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/26/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/26/2024    NhanDinhVan    Create
 */

public class _Q1_Leetcode_Find_the_Original_Typed_String_I {
    public int possibleStringCount(String word) {
        //Leetcode: 3330. Find the Original Typed String I
        // a b b c c c c
        int result = 1;
        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                result++;
            }
        }
        return result;
    }
}
