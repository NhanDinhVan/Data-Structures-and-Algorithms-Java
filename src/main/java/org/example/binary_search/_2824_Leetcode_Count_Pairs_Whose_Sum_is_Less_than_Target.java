package org.example.binary_search;

import java.util.List;

/**
 * _2824_Leetcode_Count_Pairs_Whose_Sum_is_Less_than_Target
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

public class _2824_Leetcode_Count_Pairs_Whose_Sum_is_Less_than_Target {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i = 0; i < nums.size() - 1; i++){
            for(int j = i+1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target) count++;
            }
        }

        return count;
    }
}
