package org.example.data_structures.String;

import java.util.LinkedList;
import java.util.Stack;

/**
 * _1021_Leetcode_Remove_Outermost_Parentheses
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/4/2025    NhanDinhVan    Create
 */

public class _1021_Leetcode_Remove_Outermost_Parentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (level > 0) result.append(c); // Bỏ ngoặc ngoài cùng
                level++;
            } else {
                level--;
                if (level > 0) result.append(c); // Bỏ ngoặc ngoài cùng
            }
        }

        return result.toString();
    }
}
