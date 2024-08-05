package org.example.data_structures.array;

import java.util.Arrays;

public class _169_Leetcode_Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.stream(nums).sorted();
        int max = nums[0];
        int count = 1;
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return max;
        for(int i = 1 , j = 0; i < nums.length ; i++)
        {
            if(nums[i] == nums[j])
            {
                count++;
            }else{
                max = ((i-j+1) >= count) ? nums[j] : max;
            }
        }
        return max;
    }
}
