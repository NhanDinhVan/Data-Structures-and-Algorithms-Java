package org.example.daily_challenge;

import java.util.Arrays;

/**
 * _1790_Leetcode_Check_if_One_String_Swap_Can_Make_Strings_Equal
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/5/2025    NhanDinhVan    Create
 */

public class _1790_Leetcode_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int i1 = -1, i2 = -1;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)) continue;

            if(i1 == -1){
                i1 = i;
            }else if(i2 == -1){
                i2 = i;
            }else{
                return false;
            }
        }

        if(i1 == -1) return true;
        if(i2 == -1) return false;

        return s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1);
    }
}
