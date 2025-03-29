package org.example.data_structures.String;

/**
 * _482_Leetcode_License_Key_Formatting
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/29/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/29/2025    NhanDinhVan    Create
 */

public class _482_Leetcode_License_Key_Formatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        s = s.replace("-", "").toUpperCase();
        int j = 0;

        for(int i = s.length()-1; i >= 0; i--){
            ans.append(s.charAt(i));
            j++;
            if(j % k == 0 && i != 0){
                ans.append("-");
            }
        }
        return ans.reverse().toString();
    }
}
