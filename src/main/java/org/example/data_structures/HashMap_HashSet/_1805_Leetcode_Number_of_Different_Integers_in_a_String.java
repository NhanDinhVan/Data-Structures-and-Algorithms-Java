package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * _1805_Leetcode_Number_of_Different_Integers_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/31/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/31/2025    NhanDinhVan    Create
 */

public class _1805_Leetcode_Number_of_Different_Integers_in_a_String {
    public static int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder num = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c);
            } else {
                if (num.length() > 0) {
                    set.add(num.toString().replaceFirst("^0+", ""));
                    num.setLength(0);
                }
            }
        }

        if (num.length() > 0) {
            set.add(num.toString().replaceFirst("^0+", ""));
        }

        return set.size();
    }

    public static void main(String[] args) {
        String s = "leet1234code234";

        numDifferentIntegers(s);
    }
}
