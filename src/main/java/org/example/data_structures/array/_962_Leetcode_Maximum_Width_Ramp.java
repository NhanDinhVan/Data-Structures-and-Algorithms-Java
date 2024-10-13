package org.example.data_structures.array;

/**
 * _962_Leetcode_Maximum_Width_Ramp
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/11/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/11/2024    NhanDinhVan    Create
 */

public class _962_Leetcode_Maximum_Width_Ramp {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(i < j && nums[i] <= nums[j] && j - i > max){
                    max = j - i;
                }
            }
        }
        return max;
    }
}
