package org.example.data_structures.String;

/**
 * _521_Leetcode_Longest_Uncommon_Subsequence_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  6/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 6/7/2025    NhanDinhVan    Create
 */

public class _521_Leetcode_Longest_Uncommon_Subsequence_I {
    class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) return -1;
            return Math.max(a.length(), b.length());
        }
    }
}
