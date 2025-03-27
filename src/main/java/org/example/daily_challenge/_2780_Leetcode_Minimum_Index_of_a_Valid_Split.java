package org.example.daily_challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _2780_Leetcode_Minimum_Index_of_a_Valid_Split
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

public class _2780_Leetcode_Minimum_Index_of_a_Valid_Split {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int dominant = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() * 2 > n) {
                dominant = entry.getKey();
                break;
            }
        }

        if (dominant == -1) return -1;

        int prefixCount = 0, totalCount = countMap.get(dominant);

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) {
                prefixCount++;
            }
            int suffixCount = totalCount - prefixCount;

            if (prefixCount * 2 > (i + 1) && suffixCount * 2 > (n - i - 1)) {
                return i;
            }
        }

        return -1;
    }
}
