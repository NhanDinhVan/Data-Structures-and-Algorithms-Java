package org.example.bit_manipulation;

/**
 * _190_Leetcode_Reverse_Bits
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

public class _190_Leetcode_Reverse_Bits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int left = 31;
        int right = 0;

        while(left >= right){
            int lbit = (n >> left) & 1;
            int rbit = (n >> right) & 1;

            // reverse
            if (lbit != rbit) {
                n = n ^ ((1 << left) | (1 << right));
            }

            left--;
            right++;
        }
        return n;
    }
}
