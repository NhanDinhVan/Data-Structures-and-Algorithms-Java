package org.example.contests.weekly_contest_423;

import java.util.List;

/**
 * _Q1_Adjacent_Increasing_Subarrays_Detection_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/10/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/10/2024    NhanDinhVan    Create
 */

public class _Q1_Adjacent_Increasing_Subarrays_Detection_I {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        // Loop through potential starting points for adjacent subarrays of length k
        for (int i = 0; i <= n - 2 * k; i++) {
            boolean firstIncreasing = true;

            // Check if the first subarray (starting at i) is strictly increasing
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    firstIncreasing = false;
                    break;
                }
            }

            // If the first subarray is strictly increasing, check the adjacent subarray
            if (firstIncreasing) {
                boolean secondIncreasing = true;

                // Check if the second subarray (starting at i + k) is strictly increasing
                for (int j = i + k; j < i + 2 * k - 1; j++) {
                    if (nums.get(j) >= nums.get(j + 1)) {
                        secondIncreasing = false;
                        break;
                    }
                }

                // If both are strictly increasing, return true
                if (secondIncreasing) {
                    return true;
                }
            }
        }

        // If no such adjacent increasing subarrays are found, return false
        return false;
    }
}
