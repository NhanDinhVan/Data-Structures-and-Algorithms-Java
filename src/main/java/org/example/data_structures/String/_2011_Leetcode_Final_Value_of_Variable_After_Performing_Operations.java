package org.example.data_structures.String;

/**
 * _2011_Leetcode_Final_Value_of_Variable_After_Performing_Operations
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

public class _2011_Leetcode_Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String s : operations){
            if(s.equals("X++") || s.equals("++X")) ans++;
            else ans--;
        }
        return ans;
    }
}
