package org.example.data_structures.String;

/**
 * _2264_Leetcode_Largest_3_Same_Digit_Number_in_String
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

public class _2264_Leetcode_Largest_3_Same_Digit_Number_in_String {
    public String largestGoodInteger(String num) {
        String ans = "";

        for(int i = 0; i < num.length()-2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2) && num.substring(i, i+3).compareTo(ans) > 0){
                ans = num.substring(i, i+3);
            }
        }
        return ans;
    }
}
