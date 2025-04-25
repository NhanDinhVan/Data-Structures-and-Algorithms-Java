package org.example.data_structures.String;

/**
 * _1903_Leetcode_Largest_Odd_Number_in_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/25/2025    NhanDinhVan    Create
 */

public class _1903_Leetcode_Largest_Odd_Number_in_String {
    public String largestOddNumber(String num) {
        int idx = -1;

        for(int i = num.length() - 1; i >= 0; i--){
            if((num.charAt(i) - '0')%2 != 0){
                idx = i;
                break;
            }
        }

        return (idx == -1) ? "" : num.substring(0, idx+1);
    }
}
