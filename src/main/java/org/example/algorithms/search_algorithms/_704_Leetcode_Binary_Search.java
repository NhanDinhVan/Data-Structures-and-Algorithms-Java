package org.example.algorithms.search_algorithms;

import java.util.Arrays;

/**
 * _704_Leetcode_Binary_Search
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/26/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/26/24   NhanDinhVan    Create
 */
public class _704_Leetcode_Binary_Search {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return -1;
    }
}
