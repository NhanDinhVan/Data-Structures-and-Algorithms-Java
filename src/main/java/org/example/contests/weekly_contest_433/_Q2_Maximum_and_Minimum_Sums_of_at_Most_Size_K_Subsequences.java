package org.example.contests.weekly_contest_433;

import org.example.data_structures.linked_list.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * _Q2_Maximum_and_Minimum_Sums_of_at_Most_Size_K_Subsequences
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

public class _Q2_Maximum_and_Minimum_Sums_of_at_Most_Size_K_Subsequences {
    int sum = 0;
    public int minMaxSums(int[] nums, int k) {
        return sum;
    }

    public void backtracking(int[] nums, int start, List<Integer> list, int k){
        if(start < nums.length && list.size() <= k){
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            for(int i = 0; i < list.size(); i++){
                min = Math.min(min, list.get(i));
                max = Math.max(max, list.get(i));
            }
            sum += (min + max);
            return;
        }
        list.add(nums[start]);
        backtracking(nums, start+1, list, k);
        list.remove(nums[start]);
        backtracking(nums, start+1, list, k);
    }

}
