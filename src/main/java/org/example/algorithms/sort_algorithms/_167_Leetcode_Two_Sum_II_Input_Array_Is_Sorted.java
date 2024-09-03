package org.example.algorithms.sort_algorithms;

/**
 * _167_Leetcode_Two_Sum_II_Input_Array_Is_Sorted
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/3/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/3/24   NhanDinhVan    Create
 */
public class _167_Leetcode_Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int l = i + 1;
            int h = numbers.length - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                int sum = numbers[i] + numbers[mid];
                if (sum == target) {
                    return new int[] {i + 1, mid + 1};
                } else if (sum < target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return new int[] {0, 0};
    }
}
