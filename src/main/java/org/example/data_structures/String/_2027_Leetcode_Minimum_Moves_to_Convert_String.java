package org.example.data_structures.String;

/**
 * _2027_Leetcode_Minimum_Moves_to_Convert_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/1/2025    NhanDinhVan    Create
 */

public class _2027_Leetcode_Minimum_Moves_to_Convert_String {
    public int minimumMoves(String s) {
        // int anchor = -1;
        // int ans = 0;

        // for(int i = 0; i < s.length(); i++){
        //     if(i > anchor & s.charAt(i) == 'X'){
        //         anchor = i + 2;
        //         ans++;
        //     }
        // }

        // return ans;
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'X'){
                ans++;
                i+=2;
            }
        }
        return ans;
    }
}
