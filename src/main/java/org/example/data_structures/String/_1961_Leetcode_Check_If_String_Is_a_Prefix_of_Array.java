package org.example.data_structures.String;

/**
 * _1961_Leetcode_Check_If_String_Is_a_Prefix_of_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/25/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/25/2024    NhanDinhVan    Create
 */

public class _1961_Leetcode_Check_If_String_Is_a_Prefix_of_Array {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            if (sb.toString().equals(s)) {
                return true;
            }
            if (sb.length() > s.length()) {
                return false;
            }
        }
        return false;
    }
}
