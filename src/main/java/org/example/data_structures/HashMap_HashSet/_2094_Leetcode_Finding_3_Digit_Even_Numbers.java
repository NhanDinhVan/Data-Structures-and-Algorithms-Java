package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * _2094_Leetcode_Finding_3_Digit_Even_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/31/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/31/2025    NhanDinhVan    Create
 */

public class _2094_Leetcode_Finding_3_Digit_Even_Numbers {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            if(digits[i] == 0) continue;

            for(int j = 0; j < n; j++) {
                if(j == i) continue;

                for(int k = 0; k < n; k++) {
                    if(k == i || k == j) continue;
                    if(digits[k] % 2 == 0) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }

        int[] ans = new int[set.size()];
        int index = 0;
        for(int num : set) {
            ans[index++] = num;
        }
        Arrays.sort(ans);
        return ans;
    }
}
