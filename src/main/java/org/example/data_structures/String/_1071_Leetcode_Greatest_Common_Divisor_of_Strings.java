package org.example.data_structures.String;

/**
 * _1071_Leetcode_Greatest_Common_Divisor_of_Strings
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/27/2024    NhanDinhVan    Create
 */

public class _1071_Leetcode_Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        return str1.substring(0, GDC(str1.length(), str2.length()));
    }
    public int GDC(int a, int b){
        return b == 0 ? a : GDC(b, a%b);
    }
}
