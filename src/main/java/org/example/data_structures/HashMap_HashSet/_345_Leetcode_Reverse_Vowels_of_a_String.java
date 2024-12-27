package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _345_Leetcode_Reverse_Vowels_of_a_String
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

public class _345_Leetcode_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        Set<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        StringBuilder ans = new StringBuilder(s);
        while (i < j) {
            if (!set.contains(Character.toLowerCase(s.charAt(i)))) {
                i++;
                continue;
            }

            if (!set.contains(Character.toLowerCase(s.charAt(j)))) {
                j--;
                continue;
            }

            ans.setCharAt(i, s.charAt(j));
            ans.setCharAt(j, s.charAt(i));

            i++;
            j--;
        }
        return ans.toString();
    }
}
