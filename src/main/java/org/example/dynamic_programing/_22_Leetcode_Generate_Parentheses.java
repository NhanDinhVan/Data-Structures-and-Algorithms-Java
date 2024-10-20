package org.example.dynamic_programing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * _22_Leetcode_Generate_Parentheses
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _22_Leetcode_Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<List<String>> memo = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            memo.add(new ArrayList<>());
        }
        memo.get(0).add("");
        memo.get(1).add("()");
        for(int i = 2; i <= n; i++){
            HashSet<String> tmp = new HashSet<>();
            for(String s : memo.get(i - 1)){
                for(int j = 0; j < s.length(); j++){
                    tmp.add(s.substring(0,j)+"()"+s.substring(j));
                }
            }
            memo.set(i, new ArrayList<>(tmp));
        }
        return memo.get(n);
    }
}
