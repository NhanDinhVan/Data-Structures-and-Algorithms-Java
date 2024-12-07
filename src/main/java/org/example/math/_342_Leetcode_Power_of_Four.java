package org.example.math;

/**
 * _342_Leetcode_Power_of_Four
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

public class _342_Leetcode_Power_of_Four {
    public boolean isPowerOfFour(int n) {
        if(n == 4 || n == 1) return true;
        if(n % 4 != 0 || n == 0) return false;
        return isPowerOfFour(n/4);
    }
}
