package org.example.bit_manipulation;

/**
 * _2683_Leetcode_Neighboring_Bitwise_XOR
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/17/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/17/2025    NhanDinhVan    Create
 */

public class _2683_Leetcode_Neighboring_Bitwise_XOR {
    public boolean doesValidArrayExist(int[] derived) {
        if(isValid(derived, 0)) return true;
        if(isValid(derived, 1)) return true;
        return false;
    }
    public boolean isValid(int[] derived, int value){
        int[] original = new int[derived.length];
        original[0] = value;

        for(int i = 0; i < derived.length; i++){
            original[i] = original[i-1] ^ derived[i-1];
        }

        return (original[derived.length - 1] ^ original[0]) == derived[derived.length - 1];
    }
}
