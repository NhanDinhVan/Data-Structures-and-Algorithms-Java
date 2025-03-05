package org.example.math;

/**
 * _2413_Leetcode_Smallest_Even_Multiple
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/5/2025    NhanDinhVan    Create
 */

public class _2413_Leetcode_Smallest_Even_Multiple {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0) return n;
        return n*2;
    }
}
