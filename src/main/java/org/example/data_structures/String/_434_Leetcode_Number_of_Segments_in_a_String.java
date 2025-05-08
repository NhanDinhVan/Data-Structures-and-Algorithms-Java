package org.example.data_structures.String;

/**
 * _434_Leetcode_Number_of_Segments_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/8/2025    NhanDinhVan    Create
 */

public class _434_Leetcode_Number_of_Segments_in_a_String {
    public int countSegments(String s) {
        if(s == "") return 0;
        String[] ans = s.split(" ");
        int count = 0;
        for(String str : ans){
            if(!str.equals("")) count++;
        }
        return count;
    }
}
