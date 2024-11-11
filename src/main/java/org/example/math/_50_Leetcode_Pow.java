package org.example.math;

/**
 * _50_Leetcode_Pow
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/11/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/11/2024    NhanDinhVan    Create
 */

public class _50_Leetcode_Pow {
    public double myPow(double x, int n) {
        if(n > 0)
            return helper(x, n);
        return 1/helper(x, n);
    }
    public double helper(double x, int n){
        if(n == 0) return 1;
        return helper(x*x, n-1);
    }
}
