package org.example.dynamic_programing;

/**
 * _338_Leetcode_Counting_Bits
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _338_Leetcode_Counting_Bits {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int offset = 1;

        for(int i = 1; i <= n; i++){
            if(i == offset*2)
                offset = i;
            result[i] = result[i - offset] +1;
        }
        return result;
    }
}
