package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _2784_Leetcode_Check_if_Array_is_Good
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/15/2025    NhanDinhVan    Create
 */

public class _2784_Leetcode_Check_if_Array_is_Good {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;

        if (nums.length != n + 1) return false;

        int[] base = new int[n+1];

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            base[i] = i+1;
        }
        base[n] = n;

        return Arrays.equals(nums, base);
    }
}
