package org.example.prefix_sum;

import java.util.HashMap;

/**
 * _1588_Leetcode_Sum_of_All_Odd_Length_Subarrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/5/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/5/24   NhanDinhVan    Create
 */
public class _1588_Leetcode_Sum_of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int totalSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            hmap.put(i, currentSum);
            totalSum += arr[i];
        }

        int l = 0, r = 2;
        while (r < arr.length) {
            l = 0;
            for (int i = r; i < arr.length; i++, l++) {
                if (l == 0) {
                    totalSum += hmap.get(i);
                } else {
                    totalSum += hmap.get(i) - hmap.get(l - 1);
                }
            }
            r += 2;
        }

        return totalSum;
    }
}
