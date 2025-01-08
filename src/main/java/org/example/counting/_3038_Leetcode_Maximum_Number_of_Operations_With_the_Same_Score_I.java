package org.example.counting;

/**
 * _3038_Leetcode_Maximum_Number_of_Operations_With_the_Same_Score_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/8/2025    NhanDinhVan    Create
 */

public class _3038_Leetcode_Maximum_Number_of_Operations_With_the_Same_Score_I {
    public int maxOperations(int[] nums) {
        int tmp = nums[0]+nums[1];
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i+=2){
            if(nums[i]+nums[i+1] == tmp){
                ans++;
                continue;
            }
            break;
        }
        return ans;
    }
}
