package org.example.data_structures.String;

import java.awt.*;
import java.util.*;

/**
 * _139_Leetcode_Word_Break
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/16/2025    NhanDinhVan    Create
 */

public class _139_Leetcode_Word_Break {
    // public boolean wordBreak(String s, List<String> wordDict) {
    //     Set<String> wordSet = new HashSet<>(wordDict);
    //     return backtrack(0, s, wordSet);
    // }

    // private boolean backtrack(int index, String s, Set<String> wordSet) {
    //     if (index == s.length()) return true;

    //     for (int i = index + 1; i <= s.length(); i++) {
    //         if (wordSet.contains(s.substring(index, i)) && backtrack(i, s, wordSet)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    public boolean wordBreak(String s, ArrayList<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return backtrack(0, s, wordSet, new HashMap<>());
    }

    private boolean backtrack(int index, String s, Set<String> wordSet, Map<Integer, Boolean> memo) {
        if (index == s.length()) return true;
        if (memo.containsKey(index)) return memo.get(index);

        for (int i = index + 1; i <= s.length(); i++) {
            if (wordSet.contains(s.substring(index, i)) && backtrack(i, s, wordSet, memo)) {
                memo.put(index, true);
                return true;
            }
        }

        memo.put(index, false);
        return false;
    }
}
