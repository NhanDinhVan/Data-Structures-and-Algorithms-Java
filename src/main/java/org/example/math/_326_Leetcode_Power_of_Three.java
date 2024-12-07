package org.example.math;

/**
 * _326_Leetcode_Power_of_Three
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

public class _326_Leetcode_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        if(n == 3 || n ==1) return true;
        if(n ==0 || n%3 != 0) return false;

        return isPowerOfThree(n/3);
    }
}
