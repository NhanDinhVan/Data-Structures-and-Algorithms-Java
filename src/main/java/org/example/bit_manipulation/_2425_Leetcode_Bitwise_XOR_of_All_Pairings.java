package org.example.bit_manipulation;

/**
 * _2425_Leetcode_Bitwise_XOR_of_All_Pairings
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

public class _2425_Leetcode_Bitwise_XOR_of_All_Pairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xorOfNums1 = 0;
        int xorOfNums2 = 0;

        for (int number : nums1) {
            xorOfNums1 = xorOfNums1 ^ number;
        }

        for (int number : nums2) {
            xorOfNums2 = xorOfNums2 ^ number;
        }

        int resultFromNums1 = (nums2.length % 2 != 0) ? xorOfNums1 : 0;

        int resultFromNums2 = (nums1.length % 2 != 0) ? xorOfNums2 : 0;

        return resultFromNums1 ^ resultFromNums2;
    }
}
