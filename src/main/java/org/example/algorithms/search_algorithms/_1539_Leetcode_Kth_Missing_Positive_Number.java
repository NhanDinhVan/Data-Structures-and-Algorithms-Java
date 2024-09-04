package org.example.algorithms.search_algorithms;

/**
 * _1539_Leetcode_Kth_Missing_Positive_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/4/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/4/24   NhanDinhVan    Create
 */
public class _1539_Leetcode_Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {

        int missingCount = 0;
        int lastChecked = 0;

        for (int num : arr) {
            int gap = num - lastChecked - 1;
            if (k <= gap) {
                return lastChecked + k;
            }
            k -= gap;
            lastChecked = num;
        }

        return lastChecked + k;
    }
}
