package org.example.bit_manipulation;

/**
 * _2595_Leetcode_Number_of_Even_and_Odd_Bits
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/30/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/30/2025    NhanDinhVan    Create
 */

public class _2595_Leetcode_Number_of_Even_and_Odd_Bits {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int idx = 0;
        while(n > 0){
            int cur = n & 1;
            if(cur == 1){
                ans[idx % 2]++;
            }
            idx++;
            n >>= 1;
        }
        return ans;
    }
}
