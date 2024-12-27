package org.example.math;

/**
 * _171_Leetcode_Excel_Sheet_Column_Number
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

public class _171_Leetcode_Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            result = result*26 + charValue;
        }
        return result;
    }
}
