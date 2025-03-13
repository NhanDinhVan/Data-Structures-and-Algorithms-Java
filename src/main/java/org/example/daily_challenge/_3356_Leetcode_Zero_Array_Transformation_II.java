package org.example.daily_challenge;

/**
 * _3356_Leetcode_Zero_Array_Transformation_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/13/2025    NhanDinhVan    Create
 */

public class _3356_Leetcode_Zero_Array_Transformation_II {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] delta = new int[n+1];
        int sum = 0;
        int k = 0;

        for(int i = 0; i < n; i++){
            while(sum + delta[i] < nums[i]){
                k++;

                if(k > queries.length) return -1;

                int l = queries[k-1][0];
                int r = queries[k-1][1];
                int val = queries[k-1][2];

                if(r >= i){
                    delta[Math.max(i, l)] += val;
                    delta[r + 1] -= val;
                }
            }
            sum += delta[i];

        }

        return k;
    }
}
