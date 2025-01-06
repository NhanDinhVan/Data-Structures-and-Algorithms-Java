package org.example.data_structures.array;

/**
 * _2381_Leetcode_Shifting_Letters_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/5/2025    NhanDinhVan    Create
 */

public class _2381_Leetcode_Shifting_Letters_II {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] A = new int[n];
        for (int[] it : shifts) {
            int l = it[0];
            int r = it[1];
            int t = it[2];
            if (t == 1) {
                A[l] += 1;
                if (r + 1 < n) {
                    A[r + 1] -= 1;
                }
            } else {
                A[l] -= 1;
                if (r + 1 < n) {
                    A[r + 1] += 1;
                }
            }
        }
        for (int i = 1; i < n; ++i) {
            A[i] += A[i - 1];
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            int shift = (A[i] % 26 + 26) % 26;
            int ch = chars[i] - 'a';
            ch = (ch + shift) % 26;
            chars[i] = (char) ('a' + ch);
        }
        return new String(chars);
    }
}
