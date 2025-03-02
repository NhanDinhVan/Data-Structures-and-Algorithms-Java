package org.example.data_structures.String;

/**
 * _520_Leetcode_Detect_Capital
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/2/2025    NhanDinhVan    Create
 */

public class _520_Leetcode_Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        boolean check = false;
        int s = word.length();

        for(int i = 0; i < s; i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                if(i == 0) check = true;
                count++;
            }
        }

        return (count == s || count == 0 || (count == 1 && check));
    }
}
