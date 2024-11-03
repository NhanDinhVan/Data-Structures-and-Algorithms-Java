package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.List;

/**
 * _796_Leetcode_Rotate_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/3/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/3/2024    NhanDinhVan    Create
 */

public class _796_Leetcode_Rotate_String {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }
}
