package org.example.algorithms.search_algorithms;

/**
 * _35_Leetcode_Search_Insert_Position
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/4/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/4/24   NhanDinhVan    Create
 */
public class _35_Leetcode_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        /*
        * nums = [1       3       5       6        9       11      13]
        *                                          l
        *                                          m
        *                                          r
        * mid: l + (r - l) \ 2 = 2
        * target : 10
        *
        * */
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target)
                return m;
            if(l == r){
                if(nums[m] == target)
                    return m;
                if(nums[l] > target)
                    return l;
                else
                    return l + 1;
            }
            if(nums[m] > target)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }
}
