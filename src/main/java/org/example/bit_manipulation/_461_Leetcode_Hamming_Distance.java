package org.example.bit_manipulation;

/**
 * _461_Leetcode_Hamming_Distance
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

public class _461_Leetcode_Hamming_Distance {
    public int hammingDistance(int x, int y) {
        int newN = x^y;
        int count = 0;
        for(int i = 31; i >= 0; i--){
            if((newN >> i & 1) == 1) count++;
        }
        return count;
    }
}
