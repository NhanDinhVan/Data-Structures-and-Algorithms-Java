package org.example.two_pointer;

/**
 * _80_Leetcode_Remove_Duplicates_from_Sorted_Array_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/4/2025    NhanDinhVan    Create
 */

public class _80_Leetcode_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length){
            int cnt = 1;
            int cur = nums[fast];
            while(nums[fast] < nums.length && nums[fast] == cur){
                if(cnt < 2){
                    nums[slow] = nums[fast];
                    slow++;
                }
                cnt++;
                fast++;
            }
        }
        return slow;
    }
}
