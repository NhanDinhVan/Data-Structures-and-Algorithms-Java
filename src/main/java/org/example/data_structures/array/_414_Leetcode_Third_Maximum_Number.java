package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _414_Leetcode_Third_Maximum_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/26/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/26/24   NhanDinhVan    Create
 */
public class _414_Leetcode_Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        int i = 0;
        Arrays.sort(nums);
        int cur = nums[nums.length - 1];

        System.out.println(Arrays.toString(nums));
        for(int j = nums.length -1 ; j >= 0; j--){
            if(nums[j]!=cur){
                cur = nums[j];
                i++;
            }
            if(i == 2)
                return nums[j];
        }
        return nums[nums.length-1];
    }
}
