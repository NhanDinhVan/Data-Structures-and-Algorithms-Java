package org.example.data_structures.String;

/**
 * _1417_Leetcode_Reformat_The_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/24/2025    NhanDinhVan    Create
 */

public class _1417_Leetcode_Reformat_The_String {
    public String reformat(String s) {
        int n = s.length();
        int numIdx = 0;
        int charIdx = 0;
        int countChar = 0;
        int countNum = 0; // ✅ Sửa lại thành 0

        for(int i = 0; i < n; i++){
            if(Character.isDigit(s.charAt(i))) countNum++;
            else countChar++;
        }

        if(Math.abs(countNum - countChar) > 1) return "";

        char[] ans = new char[n];

        // Chọn vị trí bắt đầu phù hợp
        if (countChar > countNum) {
            charIdx = 0;
            numIdx = 1;
        } else {
            charIdx = 1;
            numIdx = 0;
        }

        for(int i = 0; i < n; i++){
            if(Character.isDigit(s.charAt(i))){
                ans[numIdx] = s.charAt(i);
                numIdx += 2;
            } else {
                ans[charIdx] = s.charAt(i);
                charIdx += 2;
            }
        }

        return new String(ans);
    }
}
