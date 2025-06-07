package org.example.daily_challenge;

import java.util.Arrays;

/**
 * _3375_Leetcode_Minimum_Operations_to_Make_Array_Values_Equal_to_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/9/2025    NhanDinhVan    Create
 */

public class _3375_Leetcode_Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    public int minOperations(int[] nums, int k) {
        int countK = 0;
        int greater = 0;
        int last = -1;
        boolean check = false;

        Arrays.sort(nums);

        for(int num : nums){
            if(num == k){
                countK++;
            }else if(num > k){
                if(last != num){
                    last = num;
                    greater++;
                }
            }else{
                check = true;
            }
        }
        if(check) return -1;
        if(countK == nums.length) return 0;

        return greater;
    }
}
