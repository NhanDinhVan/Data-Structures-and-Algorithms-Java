package org.example.daily_challenge;

/**
 * _2379_Leetcode_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/8/2025    NhanDinhVan    Create
 */

public class _2379_Leetcode_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        int min;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') w++;
        }

        min = w;

        for (int l = 0, r = k; r < blocks.length(); l++, r++) {
            if (blocks.charAt(l) == 'W') w--;
            if (blocks.charAt(r) == 'W') w++;
            min = Math.min(min, w);
        }

        return min;
    }
}
