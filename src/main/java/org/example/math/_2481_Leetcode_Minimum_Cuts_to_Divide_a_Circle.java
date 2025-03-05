package org.example.math;

/**
 * _2481_Leetcode_Minimum_Cuts_to_Divide_a_Circle
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

public class _2481_Leetcode_Minimum_Cuts_to_Divide_a_Circle {
    public int numberOfCuts(int n) {
        if(n == 1) return 0;
        if(n % 2 == 0) return n/2;
        return n;
    }
}
