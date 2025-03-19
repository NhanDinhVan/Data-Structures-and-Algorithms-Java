package org.example.bit_manipulation;

/**
 * _3370_Leetcode_Smallest_Number_With_All_Set_Bits
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/19/2025    NhanDinhVan    Create
 */

public class _3370_Leetcode_Smallest_Number_With_All_Set_Bits {
    public int smallestNumber(int n) {
        int b = 0;
        while(b < n){
            b = (b << 1) | 1;
        }
        return b;
    }

}
