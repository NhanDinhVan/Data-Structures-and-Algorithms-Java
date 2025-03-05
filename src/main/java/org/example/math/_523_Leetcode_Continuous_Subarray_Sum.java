package org.example.math;

import java.util.HashMap;

/**
 * _523_Leetcode_Continuous_Subarray_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/5/2025    NhanDinhVan    Create
 */

public class _523_Leetcode_Continuous_Subarray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        // for(int i = 0; i < nums.length - 1; i++){
        //     int sum = nums[i];
        //     for(int j = i + 1; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum % k == 0) return true;
        //     }
        // }
        // Nếu sum[j] % k == sum[i] % k (với j > i + 1), thì tổng đoạn từ i+1 đến j chia hết cho k.

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int remainder = sum % k;
            if(remainder < 0) remainder += k;
            if(map.containsKey(remainder)){
                if(i - map.get(remainder) > 1) return true;
            }else{
                map.put(remainder, i);
            }
        }
        return false;
    }
}
