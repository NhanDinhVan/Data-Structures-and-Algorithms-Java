package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _2563_Leetcode_Count_the_Number_of_Fair_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/13/2024    NhanDinhVan    Create
 */

public class _2563_Leetcode_Count_the_Number_of_Fair_Pairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            int minJ = binarySearchLeft(nums, i + 1, n - 1, lower - nums[i]);
            int maxJ = binarySearchRight(nums, i + 1, n - 1, upper - nums[i]);

            if(minJ <= maxJ){
                ans += (maxJ - minJ + 1);
            }
        }
        return ans;
    }

    public int binarySearchLeft(int[] nums, int left, int right, int target){
        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public int binarySearchRight(int[] nums, int left, int right, int target){
        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
}
