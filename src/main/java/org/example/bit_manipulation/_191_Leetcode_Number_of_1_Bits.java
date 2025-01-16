package org.example.bit_manipulation;

/**
 * _191_Leetcode_Number_of_1_Bits
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/16/2025    NhanDinhVan    Create
 */

public class _191_Leetcode_Number_of_1_Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 31; i >= 0; i--){
            if((n >> i & 1) == 1) count++;
        }
        return count;
    }
}
