package org.example.contests.weekly_contest_441;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * _Q1_Leetcode_Maximum_Unique_Subarray_Sum_After_Deletion
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/16/2025    NhanDinhVan    Create
 */

public class _Q1_Leetcode_Maximum_Unique_Subarray_Sum_After_Deletion {
    public int maxSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : set) {
            maxHeap.add(num);
        }

        int first = maxHeap.peek();

        if (first < 0) {
            return first;
        }

        int totalSum = 0;
        while (!maxHeap.isEmpty() && maxHeap.peek() >= 0) {
            totalSum += maxHeap.poll();
        }

        return totalSum;
    }
}
