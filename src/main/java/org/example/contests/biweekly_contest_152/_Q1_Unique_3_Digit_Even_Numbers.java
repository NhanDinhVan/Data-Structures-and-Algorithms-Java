package org.example.contests.biweekly_contest_152;

import java.util.HashSet;
import java.util.Set;

/**
 * _Q1_Unique_3_Digit_Even_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/15/2025    NhanDinhVan    Create
 */

public class _Q1_Unique_3_Digit_Even_Numbers {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        backtrack(0, 0, freq, uniqueNumbers);
        return uniqueNumbers.size();
    }

    private void backtrack(int currentNum, int length, int[] freq, Set<Integer> uniqueNumbers) {
        if (length == 3) {
            if (currentNum % 2 == 0) uniqueNumbers.add(currentNum);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                if (length == 0 && i == 0) continue;
                freq[i]--;
                backtrack(currentNum * 10 + i, length + 1, freq, uniqueNumbers);
                freq[i]++;
            }
        }
    }

}
