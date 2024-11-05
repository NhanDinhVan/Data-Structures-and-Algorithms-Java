package org.example.data_structures.array;

/**
 * _2914_Leetcode_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/6/2024    NhanDinhVan    Create
 */

public class _2914_Leetcode_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful{
    public int minChanges(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i+=2){
            if(s.charAt(i) != s.charAt(i + 1))
                count++;
        }
        return count;
    }
}
