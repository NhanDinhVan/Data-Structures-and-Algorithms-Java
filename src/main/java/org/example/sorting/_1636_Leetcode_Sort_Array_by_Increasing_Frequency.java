package org.example.sorting;

import javafx.util.Pair;
import jdk.jfr.Frequency;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * _1636_Leetcode_Sort_Array_by_Increasing_Frequency
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/2/2025    NhanDinhVan    Create
 */

public class _1636_Leetcode_Sort_Array_by_Increasing_Frequency {
    public int[] frequencySort(int[] nums) {
        int[] countArr = new int[201];
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey();
            } else {
                return a.getValue() - b.getValue();
            }
        });

        for (int i : nums) {
            countArr[i + 100]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] != 0) {
                pq.add(new Pair<>(i - 100, countArr[i]));
            }
        }

        int index = 0;
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> p = pq.poll();
            int num = p.getKey();
            int freq = p.getValue();
            for (int j = 0; j < freq; j++) {
                nums[index++] = num;
            }
        }

        return nums;
    }
}
