package org.example.daily_challenge;

import java.util.HashMap;

/**
 * _2364_Leetcode_Count_Number_of_Bad_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/9/2025    NhanDinhVan    Create
 */

public class _2364_Leetcode_Count_Number_of_Bad_Pairs {
    public long countBadPairs(int[] nums) {
        long goods = 0;
        long n = nums.length;
        HashMap<Long, Long> freqMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            long key = nums[i] - i;
            goods += freqMap.getOrDefault(key, (long) 0);

            freqMap.put(key, freqMap.getOrDefault(key, (long) 0)+1);
        }

        return (long) ((n * (n - 1) / 2) - goods);
    }
}
