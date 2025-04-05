package org.example.data_structures.String;

/**
 * _344_Leetcode_Reverse_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/5/2025    NhanDinhVan    Create
 */

public class _344_Leetcode_Reverse_String {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while(l < r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++; r--;
        }
    }
}
