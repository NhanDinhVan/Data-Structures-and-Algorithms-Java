package org.example.data_structures.String;

import java.util.LinkedList;
import java.util.Queue;

/**
 * _459_Leetcode_Repeated_Substring_Pattern
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/24/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/24/2024    NhanDinhVan    Create
 */

public class _459_Leetcode_Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                if (check(s, sub)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(String s, String t){
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) != t.charAt(i%t.length()))
                return false;
        }
        return true;
    }
}
