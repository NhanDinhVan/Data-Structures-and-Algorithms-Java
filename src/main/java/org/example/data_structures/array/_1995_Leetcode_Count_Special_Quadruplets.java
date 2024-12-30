package org.example.data_structures.array;

/**
 * _1995_Leetcode_Count_Special_Quadruplets
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _1995_Leetcode_Count_Special_Quadruplets {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - 3; i++){
            for(int j = i+1; j < n - 2; j++){
                for(int k = j+1; k < n - 1; k++){
                    for(int g = k+1; g < n; g++){
                        if(nums[i]+nums[j]+nums[k] == nums[g]) count++;
                    }
                }
            }
        }
        return count;
    }
}
