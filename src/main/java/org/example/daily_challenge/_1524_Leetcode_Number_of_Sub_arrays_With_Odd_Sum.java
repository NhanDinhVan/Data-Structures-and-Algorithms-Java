package org.example.daily_challenge;

/**
 * _1524_Leetcode_Number_of_Sub_arrays_With_Odd_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/25/2025    NhanDinhVan    Create
 */

public class _1524_Leetcode_Number_of_Sub_arrays_With_Odd_Sum {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int old_count = 0, even_count = 1;
        int count = 0;
        int prefixSum = 0;

        for(int a : arr){
            prefixSum += a;

            if(prefixSum % 2 == 0){
                count = (count + old_count) % MOD;
                even_count++;
            }else {
                count = (count + even_count) % MOD;
                old_count++;
            }
        }

        return count;
    }
}
