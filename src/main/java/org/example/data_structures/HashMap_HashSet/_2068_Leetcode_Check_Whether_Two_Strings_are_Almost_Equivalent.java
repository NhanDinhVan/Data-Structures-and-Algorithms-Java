package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _2068_Leetcode_Check_Whether_Two_Strings_are_Almost_Equivalent
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/31/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/31/2025    NhanDinhVan    Create
 */

public class _2068_Leetcode_Check_Whether_Two_Strings_are_Almost_Equivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }

        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            int freq1 = m1.getOrDefault(c, 0);
            int freq2 = m2.getOrDefault(c, 0);
            if (Math.abs(freq1 - freq2) > 3) {
                return false;
            }
        }

        return true;
    }
}
