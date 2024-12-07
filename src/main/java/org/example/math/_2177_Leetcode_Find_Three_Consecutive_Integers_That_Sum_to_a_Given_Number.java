package org.example.math;

/**
 * _2177_Leetcode_Find_Three_Consecutive_Integers_That_Sum_to_a_Given_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/7/2024    NhanDinhVan    Create
 */

public class _2177_Leetcode_Find_Three_Consecutive_Integers_That_Sum_to_a_Given_Number {
    public long[] sumOfThree(long num) {
        if(num % 3 != 0) return new long[0];
        return new long[] { num / 3 - 1, num / 3, num / 3 + 1 };
    }
}
