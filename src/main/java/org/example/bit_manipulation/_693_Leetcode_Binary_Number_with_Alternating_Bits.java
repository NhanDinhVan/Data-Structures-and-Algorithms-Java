package org.example.bit_manipulation;

/**
 * _693_Leetcode_Binary_Number_with_Alternating_Bits
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/4/2025    NhanDinhVan    Create
 */

public class _693_Leetcode_Binary_Number_with_Alternating_Bits {
    public boolean hasAlternatingBits(int n) {
        while(n > 0){
            if((n & 1) == ((n>>1) & 1)) return false;
            n >>= 1;
        }
        return true;
    }
}
