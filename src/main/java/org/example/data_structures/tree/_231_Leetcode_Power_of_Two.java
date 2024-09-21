package org.example.data_structures.tree;

/**
 * _231_Leetcode_Power_of_Two
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/21/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/21/24   NhanDinhVan    Create
 */
public class _231_Leetcode_Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        if(n%2 == 0)
            return isPowerOfTwo(n/2);
        if(n == 1)
            return true;
        else
            return false;
    }
}
