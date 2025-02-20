package org.example.binary_search;

import java.util.Arrays;

/**
 * _2389_Leetcode_Longest_Subsequence_With_Limited_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/20/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/20/2025    NhanDinhVan    Create
 */

public class _2389_Leetcode_Longest_Subsequence_With_Limited_Sum {
    public int[] answerQueries(int[] nums, int[] queries) {
            Arrays.sort(nums);

            for(int i = 0; i < queries.length; i++){
                int sum = 0;
                int j = 0;

                while(j < nums.length && sum + nums[j] <= queries[i]){
                    sum += nums[j];
                    j++;
                }

                queries[i] = j;
            }

            return queries;
    }
}
