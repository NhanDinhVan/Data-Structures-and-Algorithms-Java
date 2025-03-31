package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * _2551_Leetcode_Put_Marbles_in_Bags
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

public class _2551_Leetcode_Put_Marbles_in_Bags {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if (k == 1) return 0;

        List<Integer> pairSums = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            pairSums.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairSums);

        long minScore = 0, maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairSums.get(i);
            maxScore += pairSums.get(pairSums.size() - 1 - i);
        }

        return maxScore - minScore;
    }
}
