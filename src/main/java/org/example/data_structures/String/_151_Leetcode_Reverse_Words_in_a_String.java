package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * _151_Leetcode_Reverse_Words_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _151_Leetcode_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            ans.append(parts[i]);
            if (i > 0) ans.append(" ");
        }

        return ans.toString();
    }
}
