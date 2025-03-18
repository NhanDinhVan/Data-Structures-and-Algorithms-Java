package org.example.bit_manipulation;

/**
 * _201_Leetcode_Bitwise_AND_of_Numbers_Range
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/18/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/18/2025    NhanDinhVan    Create
 */

public class _201_Leetcode_Bitwise_AND_of_Numbers_Range {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            ans += 1;
        }

        return left << ans;
    }
}
