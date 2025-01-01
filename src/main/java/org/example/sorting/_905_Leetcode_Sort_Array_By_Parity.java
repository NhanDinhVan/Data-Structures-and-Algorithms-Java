package org.example.sorting;

/**
 * _905_Leetcode_Sort_Array_By_Parity
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/1/2025    NhanDinhVan    Create
 */

public class _905_Leetcode_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;


        while (l < r){
            if(nums[l] % 2 == 1 && nums[r] % 2 == 0){
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }

            if (nums[l] % 2 == 0) l++;

            if (nums[r] % 2 == 1) r--;
        }
        return nums;
    }
}
