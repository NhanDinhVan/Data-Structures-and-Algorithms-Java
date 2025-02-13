package org.example.data_structures.heap;

import java.util.PriorityQueue;

/**
 * _2208_Leetcode_Minimum_Operations_to_Halve_Array_Sum
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

public class _2208_Leetcode_Minimum_Operations_to_Halve_Array_Sum {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a)); // Max Heap
        double sum = 0, halfSum;
        int ans = 0;

        for (int n : nums) {
            sum += n;
            pq.add((double) n);
        }
        halfSum = sum / 2;

        while (sum > halfSum) {
            ans++;
            double maxVal = pq.poll();
            double newVal = maxVal / 2;
            sum -= newVal;
            pq.add(newVal);
        }

        return ans;
    }
}
