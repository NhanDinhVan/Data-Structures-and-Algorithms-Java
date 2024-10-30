package org.example.backtracking;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _1593_Leetcode_Split_a_String_Into_the_Max_Number_of_Unique_Substrings
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/28/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/28/2024    NhanDinhVan    Create
 */

public class _1593_Leetcode_Split_a_String_Into_the_Max_Number_of_Unique_Substrings {
    public int maxUniqueSplit(String s) {
        return backtrack(0, new HashSet<String>(), s);
    }

    public int backtrack(int start, HashSet<String> memo, String s){
        if(start == s.length()){
            return 0;
        }
        int maxSplit = 0;
        for(int end = start+1; end <= s.length(); end++){
            String sub = s.substring(start, end);
            if(!memo.contains(sub)){
                memo.add(sub);
                maxSplit = Math.max(maxSplit, 1 + backtrack(end, memo, s));
                memo.remove(sub);
            }
        }
        return maxSplit;
    }
}
