package org.example.data_structures.String;

/**
 * _168_Leetcode_Excel_Sheet_Column_Title
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/21/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/21/24   NhanDinhVan    Create
 */
public class _168_Leetcode_Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        StringBuilder r = new StringBuilder();
        while(columnNumber != 0){
            columnNumber--;
            int l = columnNumber % 26;
            columnNumber /= 26;
            r.append((char) (l+'A'));
        }
        return r.reverse().toString();
    }
}
