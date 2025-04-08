package org.example.daily_challenge;

import java.util.HashSet;

/**
 * _3396_Leetcode_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/8/2025    NhanDinhVan    Create
 */

public class _3396_Leetcode_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {
    public int minimumOperations(int[] nums) {
        int idx = -1;
        int ans = 0;

        while(idx < nums.length){
            HashSet<Integer> set = new HashSet<>();
            boolean check = true;
            for(int i = idx + 1; i < nums.length; i++){
                if(set.contains(nums[i])){
                    check = false;
                    break;
                }
                set.add(nums[i]);
            }
            if(check) return ans;
            idx+=3;
            ans++;
        }

        return ans;
    }
}
