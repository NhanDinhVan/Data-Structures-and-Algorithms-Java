package org.example.contests.weekly_contest_422;

/**
 * _Q1_Leetcode_Check_Balanced_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/3/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/3/2024    NhanDinhVan    Create
 */

public class _Q1_Leetcode_Check_Balanced_String {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        // Iterate through the string and sum the digits at even and odd indices
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            if (i % 2 == 0) { // Even index
                evenSum += digit;
            } else { // Odd index
                oddSum += digit;
            }
        }

        // Return true if the sums are equal, false otherwise
        return evenSum == oddSum;
    }
}
