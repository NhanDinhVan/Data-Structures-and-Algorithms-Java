package org.example.daily_challenge;

/**
 * _3208_Leetcode_Alternating_Groups_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/9/2025    NhanDinhVan    Create
 */

public class _3208_Leetcode_Alternating_Groups_II {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] newColors = new int[colors.length + k - 1];
        int count = 0;

        for(int i = 0; i < newColors.length; i++){
            newColors[i] = colors[i%colors.length];
            // System.out.println(newColors[i]);
        }

        int l = 0;

        for(int r = 0; r < newColors.length; r++){
            if(r > 0 && newColors[r] == newColors[r-1]) l = r;

            if(r - l + 1 >= k) count++;
        }

        return count;
    }
}
