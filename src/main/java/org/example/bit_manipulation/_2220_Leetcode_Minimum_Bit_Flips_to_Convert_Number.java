package org.example.bit_manipulation;

/**
 * _2220_Leetcode_Minimum_Bit_Flips_to_Convert_Number
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

public class _2220_Leetcode_Minimum_Bit_Flips_to_Convert_Number {
    public int minBitFlips(int start, int goal) {
        int newN = start^goal;
        int count = 0;
        for(int i = 31; i >= 0; i--){
            if((newN >> i & 1) == 1) count++;
        }
        return count;
    }
}
