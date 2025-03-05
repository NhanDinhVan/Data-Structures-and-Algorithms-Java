package org.example.math;

/**
 * _1922_Leetcode_Count_Good_Numbers
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

public class _1922_Leetcode_Count_Good_Numbers {
    public static final long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n + 1) / 2;
        return (int) (pow(odd, 4) * pow(even, 5) % mod);
    }

    public long pow(long n, long x){
        if(n == 0) return 1;
        long haft = pow(n/2, x);
        if(n % 2 == 0) return (haft * haft) % mod;
        return (haft * haft * x) % mod;
    }
}
