package org.example.data_structures.other;

import java.util.Arrays;

/**
 * _387_Leetcode_First_Unique_Character_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/2/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/2/2024    NhanDinhVan    Create
 */

public class _387_Leetcode_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        // use a counting array
        int[] countArray = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            int n = s.charAt(i) - 'a';
            countArray[n] ++;
        }
        for(int i = 0 ; i < countArray.length ; i++)
            if(countArray[i] == 1)
                return i;
        return -1;
    }
    //  l o v e l e e t c o d e
    //  i j
    //  l e e t c o d e
    //  
}
