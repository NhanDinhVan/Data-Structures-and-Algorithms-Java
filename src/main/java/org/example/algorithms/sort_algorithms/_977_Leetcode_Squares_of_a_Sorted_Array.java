package org.example.algorithms.sort_algorithms;

/**
 * _977_Leetcode_Squares_of_a_Sorted_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/2/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/2/24   NhanDinhVan    Create
 */
public class _977_Leetcode_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++)
            nums[i] *= nums[i];
        for(int i = 0 ; i < nums.length; i++){
            int min = i;
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[j] < nums[min])
                    min = j;
            }
            if(min != i){
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
            }
        }
        return nums;
    }
}
