package org.example.data_structures.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * _2099_Leetcode_Find_Subsequence_of_Length_K_With_the_Largest_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/24/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/24/2024    NhanDinhVan    Create
 */

public class _2099_Leetcode_Find_Subsequence_of_Length_K_With_the_Largest_Sum {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<int[]> pqValue = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        PriorityQueue<int[]> pqIndex = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i = 0; i < nums.length; i++) pqValue.add(new int[] {i,nums[i]});
        for(int i = k-1; i >=0; i--) pqIndex.add(pqValue.poll());
        for(int i = 0; i < k; i++) ans[i] = pqIndex.poll()[1];
        return ans;
    }
}
