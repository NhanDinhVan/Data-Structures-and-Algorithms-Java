package org.example.contests.weekly_contest_440;

/**
 * _Q1_Fruits_Into_Baskets_II
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

public class _Q1_Fruits_Into_Baskets_II {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        boolean[] used = new boolean[n];
        int unplaced = 0;

        for (int fruit : fruits) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= fruit && !used[j]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }
        return unplaced;
    }
}
