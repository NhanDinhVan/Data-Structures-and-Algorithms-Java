package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _283_Leetcode_Move_Zeroes
 * <p>
 * Version 1.0
 * <p>
 * Date:  7/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 7/29/2024    NhanDinhVan    Create
 */

public class _283_Leetcode_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
//        int n = 0;
//        for(int i = 0; i < nums.length ; i++)
//        {
//            if(nums[i] != 0 )
//            {
//                nums[n++] = nums[i];
//            }
//        }
//        for(int i = n; i < nums.length; i++)
//            nums[i] = 0;

        //Solution 2

//        int[] result = new int[nums.length];
//        int j = 0;
//        for(int i = 0; i < nums.length ; i++)
//        {
//            if(nums[i] != 0)
//            {
//                result[j++] = nums[i];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = result[i];
//        }

        //Solution 3
        int j = 0;
        while(j < nums.length)
        {
            if(nums[j] == 0) {
                for (int i = j + 1; i < nums.length - 1; i++)
                    nums[i] = nums[i + 1];
                nums[nums.length - 1] = 0;
            }
            else
                j++;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
