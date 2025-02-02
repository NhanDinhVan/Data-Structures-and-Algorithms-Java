package org.example.daily_challenge;

import java.util.Arrays;

/**
 * _1752_Leetcode_Check_if_Array_Is_Sorted_and_Rotated
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/2/2025    NhanDinhVan    Create
 */

public class _1752_Leetcode_Check_if_Array_Is_Sorted_and_Rotated {
    public boolean check(int[] nums) {
        int n  = nums.length;
        int[] sortedArr = new int[n];

        for(int i = 0; i < n; i++){
            sortedArr[i] = nums[i];
        }

        Arrays.sort(sortedArr);

        for(int i = 0; i < n; i++){
            if(Arrays.equals(nums, sortedArr)) return true;

            int tmp = nums[0];
            for(int j = 0; j < n - 1; j++){
                nums[j] = nums[j+1];
            }
            nums[n-1] = tmp;
        }

        return false;
    }
}
