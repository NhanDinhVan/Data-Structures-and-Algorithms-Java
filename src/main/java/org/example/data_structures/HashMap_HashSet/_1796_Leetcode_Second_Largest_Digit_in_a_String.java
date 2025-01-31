package org.example.data_structures.HashMap_HashSet;

/**
 * _1796_Leetcode_Second_Largest_Digit_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/31/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/31/2025    NhanDinhVan    Create
 */

public class _1796_Leetcode_Second_Largest_Digit_in_a_String {
    public int secondHighest(String s) {
        int max = -1, second = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0';

                if (num > max) {
                    second = max;
                    max = num;
                } else if (num > second && num < max) {
                    second = num;
                }
            }
        }

        return second;
    }
}
