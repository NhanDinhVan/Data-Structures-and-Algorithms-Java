package org.example.two_pointer;

/**
 * _2149_Leetcode_Rearrange_Array_Elements_by_Sign
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _2149_Leetcode_Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {
//        int size = nums.length;
//        int[] newNums = new int[size];
//        int i = 0;
//        int n = 0;
//        int p = 0;
//
//        while(i < size && n < size && p < size -1){
//            while (nums[p] < 0) p++;
//            newNums[i++] = nums[p];
//            p++;
//            while (nums[n] > 0) n++;
//            newNums[i++] = nums[n];
//            n++;
//        }
//        return newNums;


        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}
