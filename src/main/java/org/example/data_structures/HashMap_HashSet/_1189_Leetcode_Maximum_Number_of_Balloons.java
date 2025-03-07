package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _1189_Leetcode_Maximum_Number_of_Balloons
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/7/2025    NhanDinhVan    Create
 */

public class _1189_Leetcode_Maximum_Number_of_Balloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> balloonMap = new HashMap<>();
        HashMap<Character, Integer> textMap = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        balloonMap.put('b', 1);
        balloonMap.put('a', 1);
        balloonMap.put('l', 2);
        balloonMap.put('o', 2);
        balloonMap.put('n', 1);

        for (char c : text.toCharArray()) {
            textMap.put(c, textMap.getOrDefault(c, 0) + 1);
        }

        for (char c : balloonMap.keySet()) {
            ans = Math.min(ans, textMap.getOrDefault(c, 0) / balloonMap.get(c));
        }

        return ans;
    }
}
