package org.example.binary_search;

/**
 * _34_Leetcode_Find_First_and_Last_Position_of_Element_in_Sorted_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _34_Leetcode_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = findLeftIndex(nums, target);
        result[1] = findRightIndex(nums, target);

        return result;
    }
    public int findLeftIndex(int[] nums, int target){
        int index = -1;
        int l = 0;
        int r = nums.length-1;

        while (l <= r){
            int m = l + (r-l)/2;

            if(nums[m] >= target){
                r = m-1;
            }else{
                l = m+1;
            }

            if(nums[m] == target) index = m;
        }

        return index;
    }
    public int findRightIndex(int[] nums, int target){
        int index = -1;
        int l = 0;
        int r = nums.length-1;

        while (l <= r){
            int m = l + (r-l)/2;

            if(nums[m] <= target){
                l = m+1;
            }else{
                r = m-1;
            }
            if(nums[m] == target) index = m;
        }

        return index;
    }
}
