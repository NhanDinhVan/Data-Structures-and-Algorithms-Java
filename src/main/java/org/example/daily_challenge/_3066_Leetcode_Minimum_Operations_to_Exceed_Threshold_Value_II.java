package org.example.daily_challenge;

import java.util.PriorityQueue;

/**
 * _3066_Leetcode_Minimum_Operations_to_Exceed_Threshold_Value_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/13/2025    NhanDinhVan    Create
 */

public class _3066_Leetcode_Minimum_Operations_to_Exceed_Threshold_Value_II {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int ans = 0;

        for(int n : nums){
            pq.add((long) n);
        }

        while(pq.size() >=2 && pq.peek() < k){
            ans++;
            long x = pq.poll();
            long y = pq.poll();
            pq.add((Long) (Math.min(x, y) * 2 + Math.max(x, y)));
        }

        return ans;
    }
}
