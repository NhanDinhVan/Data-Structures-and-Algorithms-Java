package org.example.binary_search;

/**
 * _875_Leetcode_Koko_Eating_Bananas
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/14/2025    NhanDinhVan    Create
 */

public class _875_Leetcode_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        long total = 0;
        for (int p : piles) {
            high = Math.max(high, p);
            total += p;
        }

        if (h >= total) return 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (check(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean check(int[] piles, int h, int k) {
        int count = 0;
        for (int p : piles) {
            count += (p + k - 1) / k; // Công thức chính xác
            if (count > h) return false; // Nếu quá h, thoát sớm
        }
        return count <= h;
    }
}
