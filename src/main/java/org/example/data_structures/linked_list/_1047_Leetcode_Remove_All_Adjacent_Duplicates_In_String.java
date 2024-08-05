package org.example.data_structures.linked_list;

/**
 * _1047_Leetcode_Remove_All_Adjacent_Duplicates_In_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  7/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 7/29/2024    NhanDinhVan    Create
 */

public class _1047_Leetcode_Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        int i = 0;
        int j = 0;
        while(i < s.length()-1)
        {
            char n = s.charAt(i);
            char m = s.charAt(i+1);
            if(n == m)
            {
                s = s.substring(0 , i) + s.substring( i+2 , s.length());
                if(i != 0)
                    i--;
            }else {
                i++;
            }
        }
        return s;
    }
}
