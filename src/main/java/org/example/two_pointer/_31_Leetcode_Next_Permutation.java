package org.example.two_pointer;

/**
 * _31_Leetcode_Next_Permutation
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/18/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/18/2025    NhanDinhVan    Create
 */

public class _31_Leetcode_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }

        if(i >= 0){
            int j = n - 1;

            while(nums[j] <= nums[i]){
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j){
        while(j > i){
            swap(nums, i, j);
            i++; j--;
        }
    }
}
